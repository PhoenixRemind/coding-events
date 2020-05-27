# coding-events

Purpose of the Application: The ability to create and store information regarding events

Current State: Current State App is linked up to database. Can create and store both Events and Event Categories as well as tag/sort events.

Future Improvements: Implementation of Person class. Future Improvements Add person class to app that tracks the people attending each event.

Person Models

@Controller
PersonController to set up Person Profile

@Autowire
PersonRepository

@GetMapping("create")
public String displayCreatePersonProfile

@PostMapping("create")
public string processCreatePersonProfile

@Repository
PersonRepository extends CrudRepository<Person, Integer>

//Person Class
@Entity
Person extends AbstractEntity
private String firstName
private String lastName

//PersonDetail Class
@Entity
PersonDetails extends AbstractEntity
private String email (username)
private String password
private String address - validation
private Date birthday - validation

public void method for birthday promotion

constructors (+no arg)

getters names/email/address/bday

setters email/address/bday/names

EventDetails
Inside create/edit, add a person, increment numAttendees +1 for each person added to event
