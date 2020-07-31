# Save-Life-Android
<h3>Smart Diagnostic Assessment and Diagnostic testing system for the Healthcare industry - AI / IoT / Machine Learning / ML Text recognition and Detection / Vision API and OCR / Firebase / ML kit  / Android / Java </h3>
<img src="Screenshot/poster.png"  alt="Screenshot"/>

<h3>Abstract.</h3>
<p>Usually, according to the principles and policies of the medical professionals, the diagnostic procedure needs to analyze diagnostic reports like full blood, etc. And needs to read several kinds of scan reports, etc... (Initial Diagnostic Assessment and Diagnostic Testing). Today, most fields of healthcare have faced a lack of efficiency issues because there is no proper communication link in medical laboratories and medical professionals to analytics medical problems and diagnosis according to investigation reports. Also need to improve the procedure of predict risks for illnesses and epidemics, take pro-active and precaution, investigate the nature of the illness, make decisions and sickness collaboration, efficient investigation procedure and develop exciting new techniques to treat diseases.<p>
<p>The aim of this mobile application is how to analyze patients' Diagnostic Reports and visualize patients' information in a proper way using Machine Learning text recognition, optical character recognition, Real-Time Data Manipulation, and text analytics techniques. The application is Integrated by the firebase database Authentication security policy and it will control data access. Text recognition and the text extraction process will be implemented by using Firebase Machine learning Kit’s text recognition APIs with High accuracy. The mobile application allows extract data from the investigation reports and inserts data into the firebase real-time database. Using the Firebase queries and filtering applications will automatically categorize data in who needs emergency treatment as priority wise.<p>
<p>Also, medical experts can monitor patients' updated investigations in real-time. Medical professionals can attend final investigations or required actions immediately Based on real-time updated data. 
Specifications of the specific medical area, medical professionals' communication capabilities, efficient real-time data manipulation, and healthcare prediction capabilities provide a platform for a new generation of Quality essential diagnostics and treatment options.<p>
  
<h3>Behavioral diagrams: Use case</h3>
<p>Use case diagram was created to the specifications that capture the overall functionality of the system at a very high-level using notations of actors, use cases, and relationships among them. This can often be used as a summary of all use cases in a system.
However, it is showing the high-level view of the functional requirements and how the Doctor, laboratory scientist and health care staff actors would interact.<p>
<p><img src="Screenshot/Usecase.jpg"  alt="Screenshot"/><p>
  
<h3>Structural diagrams: Class Diagram. </h3>
<p>The structural diagrams represent the static aspect of the system. These static aspects represent those parts of a diagram, which forms the main structure and are therefore stable.
During the design stage, the Class diagram was created to demonstrates the structure of a software system in terms of classes, attributes, operations, and the relations between them.<p>
<p><img src="Screenshot/class.png"  alt="Screenshot"/><p>
  
<h3>ER diagrams. </h3>
<p>In the software design process Sketching out a plan before start building tables and connecting them with relationships in the database is always going to be a recommended best practice. This will help to design and identify potential challenges early on before they become major flaws in the database. ER diagrams visualize the relationships of entities stored in a database and technology is Used the concept of entities, relationships, and attributes.<p>
<p><img src="Screenshot/ER Diagram.png"  alt="Screenshot"/><p>
  
<h3>Design principles and design patterns.</h3>

  <dl>
  <dt>Architectural design patterns</dt>
  <dd> -- In terms of software engineering does not start building a mobile application, or any other software system for that matter without a clear idea about its architecture. The lack of guiding principles results in cluttered code, and a tightly coupled system. Such a codebase is challenging to maintain and more prone to bugs. </dd>
  <dt>MVC</dt>
  <dd>--   Model-
In this context, all the communication between databases, APIs, and validation processes are being taken place. Therefore, the model is invisible from outside observations, it is an internal operation that compromises most of the heavy tasks.
  </dd>
  <dd>--   View-
This illustrates the visible environment for the users, in this case, Doctors, nurses, and laboratory scientists.
  <dd>
  </dd>-- Controller-
The controller involves coordination communication between model context and the view context. Therefore, no possible interruptions will occur during patents data transactions.
  </dd>
  <dt>GRASP patterns.</dt>
  <dd>-GRASP design principle consists of nine major patterns, including controller, creator etc. These GRSPE patterns composed of an answer to a software design problem. I have used not all but some of GRASP design principles in project solution design.
</dd>

<dt>HCI And Usability Engineering.</dt>
  <dd>- The goals of applying HCI principles to design: 
  Safety 
  Utility 
  Effectiveness
  Usability
“UE is an approach to the development of software and systems which involve user participation from the outset and guarantees the usefulness of the product through the use of a usability specification and metrics" (Faulkner, 2000).
</dd>


</dl>
  
  
  
  
  
  
  
  
  
  
  

