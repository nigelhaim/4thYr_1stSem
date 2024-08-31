## Introduction to Information Security 
### Chapter 1

**Do not figure on opponents not attacking: worry your own lack of preparation.**
-Book of the Five rings 

### What is information security?

- Information security in today's enterprise is a "well-informed sense of assurance that is the information risks and controls are in balance. (Jim Anderson, Inovant (2002))"
	- Balanced dapat 

### History of Information Security 
- Computer Security began immediately after the first mainframes were developed
- Groups developing code-breaking computations during World War II created the first modern computers  
- Watch the imitation game
- Lies in the outside rights for both hardware and software  
- Physical controls were needed to limit access to authorized personnel to sensitive military locations 
- Only rudimentary controls were available to defend against physical theft, espionage, and sabotage

### The 1960s
- Department of Defense’s Advanced Research Project Agency (ARPA) began examining the feasibility of a redundant networked communications  
- Larry Roberts developed the project from its inception

>[!Note] ARPANET Program Plan
>![[Pasted image 20240831090347.png]]



### The 1970s and 80s
- Phone numbers are widely distributed 
- ARPANET grew in popularity as did its potential for misuse  
- Fundamental problems with ARPANET security were identified  
	- No safety procedures for dial-up connections to the ARPANET  
	- User identification and authorization to the system were non-existent  
- In the late 1970s the microprocessor expanded computing capabilities and security threats

### R-609 - The Start of the Study of Computer Security 
- Information Security began with Rand Report R-609  
- The scope of computer security grew from physical security to include:  
	- Safety of the data  
	- Limiting unauthorized access to that data  
	- Involvement of personnel from multiple levels of the organization

### 1990s
- The networks of computers are started in common (Internet)
- Physical Security is not enough for the military 
- Networks of computers became more common, so too did the need to interconnect the networks  
- Resulted in the Internet, the first manifestation of a global network of networks  
- In early Internet deployments, security was treated as a low priority
### The Present 
- The Internet has brought millions of computer networks into communication with each other – many of them unsecured  
- Ability to secure each now influenced by the security on every computer to which it is connected

### What is Security? 
- "The quality or state of being secure--to be free from danger"
- Kapag secure tayo, ipagsabihin atleast alam natin kung ano yung measures to be protected from danger
- To be protected from adversaries  
- A successful organization should have multiple layers of security in place:
- Physical Security
	- Mga computer 
- Personal security 
	- Employees
- Operations Security 
	- The production of the product 
- Communications Security 
	- Media, Technology and content 
- Netwok Security
	- The network of the business

### What is information Security 

- The protection of information and its critical elements, including the systems and hardware that use, store, and transmit that information  
- Tools, such as policy, awareness, training, education, and technology are necessary  
- The C.I.A. triangle was the standard based on confidentiality, integrity, and availability  
- The C.I.A. triangle has expanded into a list of critical characteristics of information

### Critical Characteristics of Information
The value of information comes from the characteristics it possesses.
- Availability 
	- Present kaagad yung infromation without any obstruction in the required format 
- Accuracy 
	- Free from mistakes or error 
	- If there is modification the data is inaccurate 
- Authenticity
	- Original 
- Confidentiality 
	- Preventing of exposure to other individuals
- Integrity 
	- The quality of state of being complete and uncorrupted
- Utility
	- Meron value for some purpose or end
-  Possession 
	- The quality of state of ownership and control 

### Components of an information System
- To fully understand the importance of information security, you need to know the elements of an information system  
- An Information System (IS) is much more than computer hardware; it is the entire set of software, hardware, data, people, and procedures necessary to use information as a resource in the organization
- IS course is more end to end their rules is more on the analysts, business analysts.

### Securing the Components
 - It is the importance of the subject (Attacker) and object (being attacked) of the attack
 - The computer can be either or both the subject of an attack and/or the object of an attack  
 - When a computer is  
	 - the subject of an attack, it is used as an active tool to conduct the attack  
	- the object of an attack, it is the entity being attacked

>[!Note]- Computer as the subject or object of the attack
>![[Pasted image 20240831091725.png]]

### Balancing Security and Access
- There is no perfect security, it is a continuous process of updating and upgrading. Security always adjusts. 
- Encryption takes time and it is necessary. 
- It is impossible to obtain perfect security - it is not an absolute; it is a process 
- Security should be considered a balance between protection and availability 
- To achieve balance, the level of security must allow reasonable access, yet protect against threats

>[!Note]- Balancing Security and Access
>![[Pasted image 20240831091924.png]]
### Bottom Up approach 
- Mula sa employee pa akyat sa management
-  Security from a grass-roots effort - systems administrators attempt to improve the security of their systems  
- Key advantage - technical expertise of the individual administrators  
- Seldom works, as it lacks a number of critical features:  
	- participant support  
	- organizational staying power

### Top-down Approach 

- Initiated by upper management:  
	- issue policy, procedures, and processes  
	- dictate the goals and expected outcomes of the project  
	- determine who is accountable for each of the required actions  
- This approach has strong upper management support, a dedicated champion, dedicated funding, clear planning, and the chance to influence organizational culture  
- May also involve a formal development strategy referred to as a systems development life cycle 
	- Most successful top-down approach


>[!Note]- Approaches to security information 
>![[Pasted image 20240831092042.png]]


### The Systems Development Life Cycle 

- Information security must be managed in a manner similar to any other major system implemented in the organization  
- Using a methodology  
	- ensures a rigorous process  
	- avoids missing steps  
- The goal is creating a comprehensive security posture/program

### SDLC and the SecSDLC

The SecSDLC may be 
- Event-Driven
	- Responed through some occurence or intrusion
- Plan-driven 
	- Planed out 
- At the end of each phase comes a structured review

>[!Note]- SDLC Waterfall Methodology 
>![[Pasted image 20240831092632.png]]

### Investigation 
What is the problem the system is being developed to solve?  
- The objectives, constraints, and scope of the project are specified  
- A preliminary cost/benefit analysis is developed  
- A feasibility analysis is performed to assesses the economic, technical, and behavioral feasibilities of the process
### Analysis
- Is it outdated, updated? 
- Consists primarily of  
	- assessments of the organization  
	- the status of current systems  
	- capability to support the proposed systems 
- Analysts begin to determine 
	- what the new system is expected to do 
	- how the new system will interact with existing systems  
- Ends with the documentation of the findings and a feasibility analysis update

### Logical Design 
- Started the creation of Solution system 
- Based on business need, applications are selected capable of providing needed services  \
- Based on applications needed, data support and structures capable of providing the needed inputs are identified  \
- Finally, based on all of the above, select specific ways to implement the physical solution are chosen  \
- At the end, another feasibility analysis is performed

### Physical Design 
- Specific technologies are selected to support the alternatives identified and evaluated in the logical design  
- Selected components are evaluated based on a make-or-buy decision  
- Entire solution is presented to the end- user representatives for approval

### Implementation 
- Documentation is a must for everyone to review the application 
- Components are ordered, received, assembled, and tested  
- Users are trained and documentation created  
- Users are then presented with the system for a performance review and acceptance test

### Maintenance and Change 
- The longest and the most expensive 
- Tasks necessary to support and modify the system for the remainder of its useful life  
- The life cycle continues until the process begins again from the investigation phase  
- When the current system can no longer support the mission of the organization, a new project is implemented

### Security Systems Development Life Cycle 
- The difference is the identification of threats 
- The same phases used in the traditional SDLC adapted to support the specialized implementation of a security project  
- Basic process is identification of threats and controls to counter them  
- The SecSDLC is a coherent program rather than a series of random, seemingly unconnected actions
### Investigation
- Identifies process, outcomes and goals of the project, and constraints  

- Begins with a statement of program security policy  

- Teams are organized, problems analyzed, and scope defined, including objectives, and constraints not covered in the program policy  

- An organizational feasibility analysis is performed
### Analysis
- Conducting preliminary analysis and implementation of the control 
- Legal issues that could create an impact on the design 
- Analysis of existing security policies or programs, along with documented current threats and associated controls  
- Includes an analysis of relevant legal issues that could impact the design of the security solution  
- The risk management task (identifying, assessing, and evaluating the levels of risk) also begins
### Logical and Physical Design 
- Creates blueprints for security  
- Critical planning and feasibility analyses to determine whether or not the project should continue  
- In physical design, security technology is evaluated, alternatives generated, and final design selected  
- At end of phase, feasibility study determines readiness so all parties involved have a chance to approve the project
### Implementation 
- The security solutions are acquired (made or bought), tested, and implemented, and tested again  
- Personnel issues are evaluated and specific training and education programs conducted  
- Finally, the entire tested package is presented to upper management for final approval

### Maintenance and Change 
- The maintenance and change phase is perhaps most important, given the high level of ingenuity in today’s threats  
- The reparation and restoration of information is a constant duel with an often unseen adversary  
- As new threats emerge and old threats evolve, the information security profile of an organization requires constant adaptation

### Security Professionals and the Organization
- It takes a wide range of professionals to support a diverse information security program  
- To develop and execute specific security policies and procedures, additional administrative support and technical expertise is required


### Senior Management
- Chief Information Officer  
	- the senior technology officer  
	- primarily responsible for advising the senior executive(s) for strategic planning  
- Chief Information Security Officer  
	- responsible for the assessment, management, and implementation of securing the information in the organization  
	- may also be referred to as the Manager for Security, the Security Administrator, or a similar title

### Security Project Team
A number of individuals who are experienced in one or multiple requirements of both the technical and non-technical areas:  
– The champion  
– The team leader  
– Security policy developers  
– Risk assessment specialists  
– Security professionals  
– Systems administrators  
– End users


### Data Ownership
- Data Owner - responsible for the security and use of a particular set of information  
- Data Custodian - responsible for the storage, maintenance, and protection of the information  
- Data Users - the end systems users who work with the information to perform their daily jobs supporting the mission of the organization

### Communities of Interest
Each organization develops and maintains its own unique culture and values. Within that corporate culture, there are communities of interest:  
– Information Security Management and Professionals  
– Information Technology Management and Professionals  
– Organizational Management and Professionals


### Information Security: Is It an Art or a Science?  
- With the level of complexity in today’s information systems, the implementation of information security has often been described as a combination of art and science

### Security as Art
- No hard and fast rules nor are there many universally accepted complete solutions  
- No magic user’s manual for the security of the entire system  
- Complex levels of interaction between users, policy, and technology controls

### Security as Science 
  
- Dealing with technology designed to perform at high levels of performance  
- Specific conditions cause virtually all actions that occur in computer systems  
- Almost every fault, security hole, and systems malfunction is a result of the interaction of specific hardware and  software  
- If the developers had sufficient time, they could resolve and eliminate these faults

### Security as a Social Science  
- Social science examines the behavior of individuals interacting with systems  
- Security begins and ends with the people that interact with the system  
- End users may be the weakest link in the security chain  
- Security administrators can greatly reduce the levels of risk caused by end users, and create more acceptable and supportable security profiles