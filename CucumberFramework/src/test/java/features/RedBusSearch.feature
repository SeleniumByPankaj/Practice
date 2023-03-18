@redBusSearch

Feature: Verify redbusSearch

Scenario: Successful login with valid credentials

When enter source location as <sourceLocation>
And enter destination location as <destLocation>
And select date as <date>
And click on search button
Then verify new page

Examples:

|sourceLocation|destLocation|date|
|Wakad|Anand Rao Circle|12/12/2022|

