# Tradesman

***Final project for System Development***

This Git repository is only for reference how we would structure the API backend for our MVC (Model, View, Controller) project. 
- We would have controller, entity, service repository and dto packages that holds classes representing the containing package.
- The Model is the application object and is represented here with the entity classes. 
- The View is its screen presentation. There will be a separate frontend that will be connected to this code with an API and communicate with JSON objects. This also opens the possibility of having more than one type of view, like web, and mobile applications.
- The Controller defines the way the user interface reacts to user input.
- The repository package contains classes that will directly communicate with the database. 
- The service package contains classes that has the business logic and is an additional layer between the Controller and the Repository.
- The dto (data transfer object) package will contain classes that represent the JSON objects.
 This is where we will define what should be included in the incoming/outgoing JSON objects.

![Link to an image!](https://media.geeksforgeeks.org/wp-content/uploads/MVC-Design-Pattern.png)

- [Link to Fronter](https://kea-fronter.itslearning.com/ContentArea/ContentArea.aspx?LocationID=4057&LocationType=1)
