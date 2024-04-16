# Use Case Model

Author: Team 1

## 1 Use Case Diagram

User: Anyone who is using the grocery list manager app to manage their grocery lists

"C:\Users\anmol\Desktop\370 -D2\UseCaseModel #1.png"

Use cases:
1. Create grocery list: User can create new lists
2. Edit grocery list: The user can edit the existing lists by adding or removing items
3. Delete Grocery list: The user can delete any unwanted lists
4. View grocery list: The user can look at the details of the list
5. Sort items in list: The items in the list will be sorted in alphabetical order for the user

## 2 Use Case Descriptions

Use Case 1: Create a grocery list 

Requirements: User should be able to create a new grocery list, name it and also have the options to add items
Pre condition: 
Post condition: User should be able to save the grocery list in their lists on the device

Scenario: 
- User creates a new list
- User gives the name of the list
- User adds initial items to the list (can be optional)
- User saves list
Alternate case: User could cancel the creation process
Exception: User cannot save the list due to server error

Use Case 2: Edit the items in the list
Requirements: User should be able to add, remove, and modify items in the grocery list
Pre conditions: User selects an existing grocery list
Post conditions: Grocery List should reflect all the changes that are made by the user

Scenarios:
- User selects an existing list
- User adds, removes or edits the items in the list
- User makes changes to the items on the list (change quantity, remove item, add new item)
- User saves the updated list
- Exception: System fails to save or update the list due to connection error

