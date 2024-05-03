# code for RQ0
import os
import json
import pandas as pd
import matplotlib.pyplot as plt

# Directory containing the JSON files
directory = "/Users/user/PycharmProjects/projectResults/part1results"


counter1 = 0  # "The test sequence was executed successfully."
counter2 = 0  # "A server error occurred during the execution of the sequence."
counter3 = 0  # "The obtained status code is not informative enough to determine the outcome of the test sequence."
counter4 = 0  # "The erroneous test sequence was rejected by the server."
counter5 = 0  # "The erroneous test sequence was accepted as valid by the server."


for filename in os.listdir(directory):
    if filename.endswith(".json"):
        file_path = os.path.join(directory, filename)
        with open(file_path, 'r') as file:
            data = json.load(file)
            for result in data.get("testResults", {}).values():
                message = result.get("message")
                if message == "The test sequence was executed successfully.":
                    counter1 += 1
                elif message == "A server error occurred during the execution of the sequence.":
                    counter2 += 1
                elif message == "The obtained status code is not informative enough to determine the outcome of the test sequence.":
                    counter3 += 1
                elif message == "The erroneous test sequence was rejected by the server.":
                    counter4 += 1
                elif message == "The erroneous test sequence was accepted as valid by the server.":
                    counter5 += 1


data = {
    'Category': ['Nominal', '', '', 'Error', '', 'Total Nominal', 'Total Error', 'Total Cases'],
    'Result': ['Fail', 'Pass', 'Unknown', 'Pass', 'Fail', '', '', ''],
    'Number': [counter2, counter3, counter1, counter4, counter5, counter1+counter2+counter3, counter4+counter5, counter1+counter2+counter3+counter4+counter5]
}
df = pd.DataFrame(data)


html = """
<html>
<head>
<style>
    .table {
        width: 60%;
        margin-left: auto;
        margin-right: auto;
        border-collapse: collapse;
        font-family: Arial, sans-serif;
    }
    .table th, .table td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }
    .table th {
        background-color: #f2f2f2;
    }
    .table tr:nth-child(even){background-color: #f9f9f9;}
    .table tr:hover {background-color: #ddd;}
</style>
</head>
<body>
"""
html += df.to_html(index=False, classes='table')
html += """
</body>
</html>
"""
with open('rq0_results.html', 'w') as f:
    f.write(html)


print(df.to_string(index=False))


totalcases = df['Number'].iloc[-1]
totalerror = df['Number'].iloc[-2]
totalnominal = df['Number'].iloc[-3]

metric1 = round((counter1 / totalcases) * 100, 2)
metric2 = round((counter3 / totalnominal) * 100, 2)
metric3 = round((counter5 / totalerror) * 100, 2)

metric_values = [metric1, metric2, metric3]
metric_names = ['Non-informative Status Code', 'Successful Execution', 'Accepted Errors']
colors = ['blue', 'green', 'red']


plt.figure(figsize=(10, 6))
plt.bar(metric_names, metric_values, color=colors)
plt.xlabel('Metrics')
plt.ylabel('Percentage (%)')
plt.title('Efficiency Criteria for Test Case Generation')
plt.ylim(0, 100)
for i, v in enumerate(metric_values):
    plt.text(i, v + 0.5, f"{v}%", ha='center', va='bottom')
plt.show()




# code for RQ1


import os
import pandas as pd
import glob

def find_coverage_reports(api_directory):
    api_coverage = []


    for api_name in os.listdir(api_directory):
        if api_name == ".test-apis":
            continue

        api_path = os.path.join(api_directory, api_name)
        if os.path.isdir(api_path):
            results_path = os.path.join(api_path, 'results')

            latest_session = None
            if os.path.exists(results_path):
                sessions = [d for d in os.listdir(results_path) if
                            os.path.isdir(os.path.join(results_path, d)) and d.startswith('testing-session')]
                sessions.sort(reverse=True)  # Sort to get the latest session
                if sessions:
                    latest_session = sessions[0]

            # Check for CoverageReports folder within the latest testing session
            json_file_count = 0  # Initialize the count of JSON files
            if latest_session:
                coverage_path = os.path.join(results_path, latest_session, 'CoverageReports')
                if os.path.exists(coverage_path) and os.path.isdir(coverage_path):
                    # Count all JSON files in the CoverageReports folder
                    json_files = glob.glob(os.path.join(coverage_path, '*.json'))
                    json_file_count = len(json_files)
                    has_coverage = "Yes"
                else:
                    has_coverage = "No"
            else:
                has_coverage = "No"

            # Append the results
            api_coverage.append((api_name, has_coverage, json_file_count))


    df = pd.DataFrame(api_coverage, columns=['API Name', 'Coverage Applied', 'Coverage Metrics'])


    total_covered = 9
    df = pd.concat([df, pd.DataFrame([['Total covered', total_covered,'']], columns=['API Name', 'Coverage Applied', 'Coverage Metrics'])])

    # Adjust the index to start from 1 instead of 0
    df.index = df.index + 1
    return df


api_directory = '/Users/user/PycharmProjects/projectResults/apis'
df_coverage_reports = find_coverage_reports(api_directory)


html = """
<html>
<head>
<style>
    .table {
        width: 60%;
        margin-left: auto;
        margin-right: auto;
        border-collapse: collapse;
        font-family: Arial, sans-serif;
    }
    .table th, .table td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }
    .table th {
        background-color: #f2f2f2;
    }
    .table tr:nth-child(even){background-color: #f9f9f9;}
    .table tr:hover {background-color: #ddd;}
</style>
</head>
<body>
"""
html += df_coverage_reports.to_html(index=False, classes='table')
html += """
</body>
</html>
"""
with open('rq1_results.html', 'w') as f:
    f.write(html)

print(df_coverage_reports)


import os
import pandas as pd

def determine_coverage_levels(api_directory):
    coverage_files = [
        'PathCoverage.json',
        'OperationCoverage.json',
        'CoverageStats.json',
        'StatusCodeCoverage.json',
        'ParameterCoverage.json',
        'ParameterValueCoverage.json'
    ]

    api_coverage_levels = []

    for api_name in os.listdir(api_directory):
        api_path = os.path.join(api_directory, api_name, 'results')

        if not os.path.isdir(api_path):
            continue


        try:
            latest_session = max([os.path.join(api_path, d) for d in os.listdir(api_path)
                                  if os.path.isdir(os.path.join(api_path, d)) and d.startswith('testing-session')],
                                 key=os.path.getmtime)
        except ValueError:
            continue


        coverage_path = os.path.join(latest_session, 'CoverageReports')
        if not os.path.exists(coverage_path):
            continue

        existing_files = set(os.listdir(coverage_path))
        coverage_level = 0
        for i, file in enumerate(coverage_files):
            if file in existing_files:
                coverage_level = i + 1
            else:
                break

        api_coverage_levels.append((api_name, coverage_level))

    df = pd.DataFrame(api_coverage_levels, columns=['API Name', 'Coverage Level'])
    return df


api_directory = '/Users/user/PycharmProjects/projectResults/apis'
coverage_levels_df = determine_coverage_levels(api_directory)


html = """
<html>
<head>
<style>
    .table {
        width: 70%;
        margin-left: auto;
        margin-right: auto;
        border-collapse: collapse;
        font-family: Arial, sans-serif;
    }
    .table th, .table td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }
    .table th {
        background-color: #4CAF50;
        color: white;
    }
    .table tr:nth-child(even){background-color: #f2f2f2;}
    .table tr:hover {background-color: #ddd;}
</style>
</head>
<body>
"""
html += coverage_levels_df.to_html(index=False, classes='table')
html += """
</body>
</html>
"""
with open('rq2_results.html', 'w') as f:
    f.write(html)

print(coverage_levels_df)
