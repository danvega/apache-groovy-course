package builder

Developer dan = Developer
    .builder()
    .firstName("Dan")
    .lastName("Vega")
    .middleInitial("A")
    .email("danvega@gmail.com")
    .hireDate(new Date())
    .langugages(["Java","Groovy"])
    .build()

println dan
assert dan.firstName == "Dan"
assert dan.lastName == "Vega"
assert dan.langugages.size() == 2

