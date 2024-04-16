# Test Plan

Author: Team 1

## 1 Testing Strategy

### 1.1 Overall strategy

Our testing strategy will encompass unit testing, integration testing, system testing, and regression testing. The designated QA tester will be responsible for conducting unit tests as they develop. Integration testing will be performed to ensure that the modules integrate correctly. System testing will validate the entire application's functionality. Regression testing will ensure that new updates or fixes do not introduce new bugs.


### 1.2 Test Selection

We will employ both black-box and white-box testing techniques. Black-box testing will focus on validating the application's functionality from an end-user perspective. White-box testing will involve examining the code's internal logic and structure to ensure comprehensive coverage.

### 1.3 Adequacy Criterion

Our adequacy criterion will include both functional and structural coverage metrics. Functionally, we aim to cover all features and use cases outlined in the requirements. Structurally, we will strive for code coverage of at least all required components.

### 1.4 Bug Tracking

Any bugs and enhancement requests will be posted on a shared Google doc, where the team can review it and handle it accordingly.

### 1.5 Technology

We will attempt to utilize the Barista tool to generate automated espresso test cases. Additionally, we will leverage Android Studio's built-in testing frameworks for running and managing tests.

## 2 Test Cases

| Test Case | Class | Method | Purpose | Steps | Expected Result | Actual Result | Pass/Fail | Additional Info |
| --------- | ----- | ------ | ------- | ----- | --------------- | ------------- | --------- | --------------- |
| 1    | GroceryListManager | addItem(item: GroceryItem) | Add item to list | 1. Create a new GroceryListManager.<br>2. Add a new GroceryItem to the list. | The GroceryItem is added to the list. | | | |
| 2    | GroceryListManager | deleteItem(item: GroceryItem) | Delete item from list | 1. Create a new GroceryListManager with a populated list.<br>2. Delete an existing GroceryItem from the list. | The GroceryItem is removed from the list. | | | |
| 3    | GroceryListManager | updateQuantity(item: GroceryItem, quantity: int) | Update quantity of item | 1. Create a new GroceryListManager with a populated list.<br>2. Update the quantity of an existing GroceryItem. | The quantity of the GroceryItem is updated. | | | |
| 4    | GroceryListManager | clearAllCheckOffs() | Clear all check-offs | 1. Create a new GroceryListManager with a populated list containing checked-off items.<br>2. Call the clearAllCheckOffs() method. | All checked-off items in the list are unchecked. | | | |
| 5    | GroceryListManager | searchSimilarItems(name: String): List<GroceryItem> | Search for similar items | 1. Create a new GroceryListManager with a populated list.<br>2. Search for items with a similar name using the searchSimilarItems() method. | A list of GroceryItems with similar names is returned. | | | |
| 6    | GroceryListManager | saveList() | Save the current list | 1. Create a new GroceryListManager with a populated list.<br>2. Call the saveList() method. | The current list is saved to persistent storage. | | | |
| 7    | GroceryListManager | autoSaveList() | Automatically save changes | 1. Create a new GroceryListManager with a populated list.<br>2. Make changes to the list.<br>3. Wait for the autoSaveList() method to trigger. | The changes made to the list are automatically saved to persistent storage. | | | |
| 8    | GroceryListManager | groupItemTypes() | Group items by type | 1. Create a new GroceryListManager with a populated list containing items of different types.<br>2. Call the groupItemTypes() method. | Items in the list are grouped by their types. | | | |
| 9    | GroceryListManager | addItemByName(name: String) | Add item by name | 1. Create a new GroceryListManager.<br>2. Call the addItemByName() method with a valid item name. | A new GroceryItem with the specified name is added to the list. | | | |
| 10   | GroceryListManager | toggleCheckOff() | Toggle check-off status | 1. Create a new GroceryListManager with a populated list containing checked-off items.<br>2. Call the toggleCheckOff() method for an item. | The check-off status of the item is toggled (checked becomes unchecked, unchecked becomes checked). | | | |
| 11   | InventoryManager | addItem(itemType: ItemType) | Add item to inventory | 1. Create a new InventoryManager.<br>2. Add a new ItemType to the inventory. | The ItemType is added to the inventory. | | | |
| 12   | InventoryManager | findItem(name: String): Item | Find item by name | 1. Create a new InventoryManager with a populated inventory.<br>2. Call the findItem() method with a valid item name. | The Item with the specified name is returned. | | | |
| 13   | InventoryManager | searchSimilarItems(name: String): List<Item> | Search for similar items in inventory | 1. Create a new InventoryManager with a populated inventory.<br>2. Search for items with a similar name using the searchSimilarItems() method. | A list of Items with similar names is returned. | | | |
| 14   | InventoryManager | addNewItem(name: String, type: ItemType) | Add new item to inventory | 1. Create a new InventoryManager.<br>2. Call the addNewItem() method with a valid item name and ItemType. | A new Item with the specified name and type is added to the inventory. | | | |
| 15   | GroceryList | createList(name: String): GroceryList | Create a new grocery list | 1. Create a new GroceryList.<br>2. Call the createList() method with a valid list name. | A new GroceryList with the specified name is created. | | | |
| 16   | GroceryList | renameList(list: GroceryList, newName: String) | Rename an existing grocery list | 1. Create a new GroceryList.<br>2. Call the renameList() method with an existing list and a new name. | The name of the GroceryList is updated to the new name. | | | |
| 17   | GroceryList | selectList(name: String): GroceryList | Select a grocery list | 1. Create a new GroceryList with multiple lists.<br>2. Call the selectList() method with the name of the list to select. | The specified GroceryList is selected. | | | |
| 18   | GroceryList | deleteList(list: GroceryList) | Delete a grocery list | 1. Create a new GroceryList with multiple lists.<br>2. Call the deleteList() method with the list to delete. | The specified GroceryList is deleted. | | | |
| 19   | GroceryList | saveChanges() | Save changes to grocery list | 1. Create a new GroceryList with changes made.<br>2. Call the saveChanges() method. | The changes made to the GroceryList are saved. | | | |







