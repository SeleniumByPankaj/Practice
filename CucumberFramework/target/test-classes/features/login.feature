@test

Feature: Login Action

Background: User is on facebook

Given Launch browser and get URL

Scenario: Successful login with valid credentials

Given Launch browser and get URL
When enter username
And enter password

# ------------------------------------------------------------------

#@loginWithOutExampleKeyword

#Feature: Login Action

#Scenario: Successful login with valid credentials

#Given Launch browser and get URL
#When enter username as "pankajbharambe101"
#And enter password as "PankajTest02"

# -------------------------------------------------------------------

#@loginWithExampleKeyword
#
#Feature: Login Action
#
#Scenario: Successful login with valid credentials
#
#Given Launch browser and get URL
#When enter username as <userName>
#And enter password as <password>
#
#Examples:
#
#|userName|password|
#|pankajexampleKeyword|PankajTest03|


# -------------------------------------------------------------------

#@loginWithDataTable
#
#Feature: Login Action
#
#Scenario: Successful login with valid credentials
#
#Given Launch browser and get URL
#When enter Username
#|pankajbharambedatatable|
#And enter Password
#|PankajTest04|

#----------------------------------------------------------------------

#@loginWithDataTableMap
#
#Feature: Login Action
#
#Scenario: Successful login with valid credentials
#
#
#When enter UserName
#|username|
#|pankajbharambedatatableMAP|
#And enter PassWord
#|password|
#|PankajTest05|


