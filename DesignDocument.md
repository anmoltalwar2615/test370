# Design Document

Author: Team 1

1 Design Considerations

### 1.1 Assumptions

Possible dependencies of the software would be to have sufficient local memory space from the user's phone/tablet to hold any of the user's input data.
Ensure that the software requires as little processing power as possible to allow older generations of phones to use, effectively allowing more possible users of different generations to use.
However, some possible problems that could arise would be the software resetting its data upon exiting or not properly saving the user's input data.

### 1.2 Constraints

One constraint would be that since we're trying to make sure the application uses a low amount of processing power, it would limit the amount of possible functions on the applications as it needs to be as simple as possible.

Another constraint that we will deal with is making sure the user interface layout is properly scaled and fitted into as many mobile devices and sizes as possible. We may have to spend additional time testing mobile devices via the Android Studio emulator to make sure our user interface constraints are set properly. It may very likely be the case that the mobile app may not look exactly as the mockup. Also, if we finish early and get our Minimum Viable Product done early, we will aim to support some Tablet devices as well.

Other constraints that may be a factor are the ideal version of JDK and the Android system version that we want to support to maximize the number of supported users from previous Android versions with the least sacrifice to developer productivity since each Android version may be compatible with a specific JDK version. 

### 1.3 System Environment

Hardware: Android smartphones and tablets.
Software: Android operating system version 7.0 (Nougat) or higher, Java JDK

## 2 Architectural Design



### 2.1 Component Diagram

![DesignDocument #2 1](https://github.com/qc-se-fall23/370Fall23Sec132Team6/assets/143972565/f8d80134-f0de-44eb-9499-3c6e3f526041)


### 2.2 Deployment Diagram

Android Devices: Represented as nodes in the deployment diagram, Android devices are the physical hardware where the application is deployed and executed. This includes smartphones and tablets of various makes and models.

Grocery List Management App: The main component of the system, representing the actual Android application. It consists of the user interface components, application logic, and data management functionalities. This component is deployed and executed directly on Android devices.

Backend Services (Optional): If the application interacts with backend services such as cloud storage, synchronization services, or external APIs, these services would be represented as separate nodes in the deployment diagram. The Android app communicates with these services over the internet.

Android Operating System: This represents the underlying operating system running on Android devices. It provides the necessary runtime environment for the execution of the application.

Internet Connection: Although not explicitly shown in the deployment diagram, it's implied that Android devices require an internet connection to interact with backend services or to fetch data from external sources.

## 3 Low-Level Design





### 3.1 Class Diagram

![DesignDocument #3 1](https://github.com/qc-se-fall23/370Fall23Sec132Team6/assets/143972565/c2da96af-9aeb-472b-b1e9-016d8eb7a032)



### 3.2 Other Diagrams

![DesignDocument #3 2 prt1](https://github.com/qc-se-fall23/370Fall23Sec132Team6/assets/143972565/56d976a8-58a4-4207-8e5a-4ecc39281bc1)



![DesignDocument #3 2 prt2](https://github.com/qc-se-fall23/370Fall23Sec132Team6/assets/143972565/c8eae841-2192-46be-84d2-162a44e8c1a2)



 

## 4 User Interface Design

ViewController:

Main View 
GroceryListManagerView - Loads up the grocery lists stored on the device in a table view if there are any. Users will have the ability to click on each list to open “GroceryListView”. There will be a button to create a new grocery list.

GroceryListView - Loads up the items of the particular grocery list clicked from the table view of grocery lists in “GroceryListManagerView”. GroceryListView’s tableview cells will have information about the item such as item name and quantity. Users will have the ability to click each list to open up a “GroceryItemView”. This view has buttons to save and delete the list.

GroceryItemView - Loads up the item with its name, quantity, and type which can all be changed in this view. It has buttons to save and delete the item.

DeleteListStatusView - prompts user to make sure they want to delete the list

DeleteItemStatusView - prompts user to make sure they want to delete the item

SystemInfoView - has the user manual, a list of frequently asked questions and credits


##

![DesignDocument last part](https://github.com/qc-se-fall23/370Fall23Sec132Team6/assets/143972565/8936938f-55a0-42b2-bcb2-4a02cb06002c)


