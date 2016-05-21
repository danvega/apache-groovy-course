class School {
    String name
    List<Course> courses = []
}

class Course {
    String name
    Teacher teacher
    List<Student> students = []
}

class Teacher { String name }

class Student { String name }

def builder = new ObjectGraphBuilder(classLoader: getClass().classLoader) // Need classLoader when in Groovy console.
def firstSchool = builder.school(name: 'First School') {
    course(name: 'Math') {
        teacher(name: 'Matt')
        student(name: 'Mary', id: 'Mary')  // id attribute allows us to reference it later in the builder.
        student(name: 'John', id: 'John')
        student(name: 'Rose', id: 'Rose')
    }
    course(name: 'English') {
        teacher(name: 'Emily', id: 'Emily')
        student(refId: 'Mary')  // refId refers to id attribute we set earlier.
        student(name: 'Alex')
        student(refId: 'Rose')
    }
    course(name: 'Java') {
        teacher(refId: 'Emily')
        student(name: 'mrhaki')
        student(refId: 'John')
        student(refId: 'Mary')
    }
}

assert 'First School' == firstSchool.name
assert 3 == firstSchool.courses.size()
assert 'Math' == firstSchool.courses[0].name
assert 'Matt' == firstSchool.courses[0].teacher.name
assert 3 == firstSchool.courses[0].students.size()
assert ['English', 'Java'] == firstSchool.courses.findAll{ it.teacher.name == 'Emily' }.name
assert 'mrhaki' == firstSchool.courses[2].students.find { it.name == 'mrhaki' }.name
assert 'Mary' == firstSchool.courses.find{ it.name == 'Java' }.students.find{ it.name == 'Mary' }.name
