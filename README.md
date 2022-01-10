# Jot-in-Jiffy
Notes taking app

<b>Problem Statement</b>

Now a days, online classes are preferred more due to the pandemic. People often wants to note down these points or lectures in online classes without any hassle. 
Here comes <b>Jot in Jiffy</b> a simple easy to use and fast feature-packed notes taking app. It helps people to jot down notes in a jiffy!

**Proposed Solution**

**Jot In Jiffy** has very easy to use low complex UI which helps people to jot down notes quickly. It also saves the notes in the local database(Room database), so no worries of 
losing the data! This application has Room database,LiveData,Navigation Library,Coroutines and other android jetpack libraries. The features of this application includes saving
quicknotes,image notes,web links..etc

<p float="left">
  <img src="https://user-images.githubusercontent.com/52130837/148738571-d5c1a167-95cb-4888-85be-2a391f7a0029.jpg" width="250" />
  
  <img src="https://user-images.githubusercontent.com/52130837/148738993-c6d94e2f-21de-4290-bde2-1a998f4176e6.jpg" width="250" />
  
  
  <img src="https://user-images.githubusercontent.com/52130837/148738997-af79a684-9937-49ab-b149-17ebd1c544b6.jpg" width="250" />
  
  
  <img src="https://user-images.githubusercontent.com/52130837/148738998-6c981f94-bc66-4a37-8dc6-9153d0a2c3af.jpg" width="250" />
</p>

**Functionality & Concepts used :**

- The App has a very simple and interactive interface which helps the people to jot down notes quickly.Following are few android concepts used to achieve the functionalities in app :
- Constraint Layout : Most of the activities in the app uses a flexible constraint layout, which is easy to handle for different screen sizes.
Simple & Easy Views Design : Use of familiar audience EditText with hints and interactive buttons made it easier for people to edit,create,view notes without providing any detailed instructions pages. Apps also uses App Navigation to switch between different screens.
- RecyclerView : To present the list of different notes and image notes we used the efficient recyclerview.
- LiveData & Room Database : We are also using LiveData to update & observe any changes in the notes and update it to local databases using Room.
- Coroutines: Coroutines are added for imagepicker and for other features.
- Navigation Library: Navigation Library is used for navigating between different pages.

**Application Link & Future Scope :**

The app is currently in the Alpha testing phase with CCE institute with a limited no. of users, You can access the app : https://github.com/Jcupzz/Jot-in-Jiffy/tree/master/app/apk (Github link of the .apk file).

Once the app is fully tested and functional in CCE institute, we plan to talk to neighboring colleges also to propose this app idea. Also we are planning to connect it to network to store data in the cloud.






