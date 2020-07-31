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
  <dd>In terms of software engineering does not start building a mobile application, or any other software system for that matter without a clear idea about its architecture. The lack of guiding principles results in cluttered code, and a tightly coupled system. Such a codebase is challenging to maintain and more prone to bugs. </dd>
  <dt>MVC</dt>
  <dd>Model-In this context, all the communication between databases, APIs, and validation processes are being taken place. Therefore, the model is invisible from outside     observations, it is an internal operation that compromises most of the heavy tasks.</dd>
  <dd>View-This illustrates the visible environment for the users, in this case, Doctors, nurses, and laboratory scientists.</dd>
  <dd>Controller-The controller involves coordination communication between model context and the view context. Therefore, no possible interruptions will occur during patents data transactions.</dd>
  <dt>GRASP patterns.</dt>
  <dd>GRASP design principle consists of nine major patterns, including controller, creator etc. These GRSPE patterns composed of an answer to a software design problem. I have used not all but some of GRASP design principles in project solution design.</dd>

<dt>HCI And Usability Engineering.</dt>
  <dd>The goals of applying HCI principles to design:
 <ul>
  <li>Safety </li>
  <li>Utility</li>
  <li>Effectiveness</li>
  <li>Usability</li>
</ul>
 
“UE is an approach to the development of software and systems which involve user participation from the outset and guarantees the usefulness of the product through the use of a usability specification and metrics" (Faulkner, 2000).
<ul>
  <li>Schneiderman’s eight golden rules.</li>
  <li>Norman’s Seven Principles. </li>
  <li>5.8.3	Nielsen’s Ten Heuristics.</li>
</ul>  
</dd>

<dt>Material Design</dt>
  <dd>Beginning with Android Five Lollipop, Google introduced a new design language known as Material Design. Material Design is a visual language uniting style, branding, interaction, and motion under a consistent set of principles both in Android and for web applications. 
  <ul>
  <li>Material metaphor.</li>
  <li>Grids, typography, and colors.</li>
  <li>Motion focuses.</li>
</ul>  
</dd>
</dl>

<h2>Methods of Approach and Project Management.</h2>
<p>When developing software, change is unavoidable. Requirements change for a variety of reasons. When the technology used to build the software becomes obsolete it makes software development inherently risky and creates unplanned adjustments and affects continuous improvement. To manage these challenges, there is an outline of the methodology and implementation of the Rational Unified Process, Agile Approach, and PRINCE2 management that took place during the project.<p>
  
<h3>PRINCE2.</h3>
<p>PRINCE2 is a mature method developed through extensive consultation with project professionals. It provides a framework with guidance on what needs to be done and when, but without being prescriptive on how to do it. Also, we can achieve several benefits using PRINCE2 compatible with the project and the agile environment.<p>
  <h5>PRINCE2 Principles / best practices and Project Specifications.</h5>
<dl>
  <dt>Continued business justification.</dt>
  <dd>Every project needs a good reason to start. If considering the project benefits do not stack up to the project Succeed, then why go ahead? Thus. A business case should exist in some format for the project proposal and Project initiation Document and there should be also the alignment of the project with the corporate objectives.  Also, important to recognize the project with justification to proceed, should review that the justification still exists during the project as things can change in the external environment.</dd>
  <dt>Learning from experience. </dt>
  <dd>Learning lessons from similar and past medical investigation-based projects were very useful for manage project Scope and project Aim.</dd>
  
  <dt>Managed by stages.</dt>
  <dd>In the Project initiation document’s Project Plan was defined by project stages, as the initiation stage and the seven Build stages. 
Furthermore, there was Included how many and how long management stages depend on a number of factors, like the size and the complexity of the project, or where the major control or major decision points will be, and also the level of risk associated (Project Management Artefacts) with the work.</dd>
  <dt>Focusing on products. </dt>
  <dd>PRINCE2 suggests that we focus our planning effort on what needs to be delivered and the quality it should meet rather than what we need to do. This helps with initial scope definition and reduces the risk of failure of the final product.</dd>
  <dt>Proposal.</dt>
  <dd>the project proposal was included problem identification, the project’s rationale, and any user expectations as well as the intended solution. </dd>
  <dt>PID. </dt>
  <dd>A Document providing a more Detailed on top of that in the project brief environment, including scope, business case, quality plans, and an assessment of potential risks</dd>
  <dt>Project Plan.</dt>
  <dd>The overall key activity of the intended schedule for each stage of the project include in each project artifact documents.  </dd>
  <dt>Risk Management.</dt>
  <dd>The risk management plan was included risk identification, assessment, mitigation, monitoring, and control descriptions. Moreover, it describes the description of brainstorm risks, characteristics of the risks, schedule, impact to scope, addressing risks and Qualitative analysis of risk, and responses of risks. The overall key activity of the intended risk plans for each stage of the project’s was included in each project artifact documents.   </dd>
  
<dt>Quality Management</dt>
  <dd>The overall key activity of the intended Quality plans for each stage of the project’s was included in each project artifact documents. Also, includes Quality Planning, Quality Assurance, Quality Control, Verification & Validation are containing the Quality management plan.</dd>
  <dt>End of stage reviews </dt>
  <dd>According to agile and Rational unified process Implemented through ‘End of Stage Discussions' at the end of each stage in this report.</dd>
</dl>


<h3>Trello</h3>
<p>The Trello simple web-based tool and Agile is a natural fit lightweight way for project development. Also, Agile and Trello have the flexibility to be applied in many ways.<p>

<h3>Version control and GitHub</h3>
<p>The version control system used in this project was GitHub. Using Git as a source code management tool has become an essential skill for all developers. Git helps manage the code in new features when developing a project. Also helps to find and fix problems and simplifies collaboration with other developers where are they around the world. Furthermore, the repository is stored on GitHub and not just kept locally, this prevents data from being lost in the event of local hardware failure.<p>
  
<h3>Rational Unified Process.</h3>
<p>An initial plan was drafted up during the early stages of the project. Rational Unified Process (RUP) was an attempt to come up with a comprehensive iterative software development process. RUP is essentially a large pool of knowledge. RUP consists of artifacts, processes, templates, phrases, and disciplines. It has detailed documentation, guidelines, sample artifacts, and deliverables. RUP is defined to be a customizable process that would work for building small, medium, and large software systems and process can customize Which called plugins. Also, RUP was greatly influenced by object-oriented analysis and design, and UML. RUP has four phases: Inception, elaboration, construction, and transition. <p>
<p>According to the Rational Unified Process (RUP) guidelines, each phase has one or more iterations. Each RUP phase ends with a milestone and at the end of the inception phase, it can achieve the Lifecycle Objectives Milestone. Furthermore, the initial plan has considered Iteration Length and Timeboxing. That makes revisit existing software and improve it.<p>
<h5>Iterative and Incremental software Development benefits. </h5> 
  <ul>
  <li>Early mitigation of high-risk based on Iteration length and timeboxing.</li>
  <li>Handle evolving requirements.</li>
  <li>Ensuring visible progress.</li>
  <li>Early feedback</li>
  <li>To Manage complexity</li>
  <li>Short and simple steps</li>
  li>Methodological improvements in the development process.</li>
  <li>Series of steps to ensuring quality is built into the software.</li>
  <li>Get a robust architecture.</li>
</ul>



  
  
  
  
  
  
  
  
  
  
  

