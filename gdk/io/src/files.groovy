// create a new file
def file = new File('dummy.txt')
file.write("This is some new text \n")

// or new File('dummy.txt').text = 'this is a one liner'

// append
//file.append("I am appending text...\n")

// readLines
//List lines = file.readLines()
//println lines
//lines.each { line ->
//     println line
//}

// create a new file with a bunch of text and read it
// println new File('dummy.txt').text

// list all the files in a directory
// eachFile(closure)
//String dir = '/Users/vega/dev/groovy/apache-groovy-course'
//new File(dir).eachFile { file ->
//    // show all first
//    if( file.isFile() ){
//        println file.name
//    }
//
//}

// eachFileRecurse
//String groovyCourse = '/Users/vega/dev/groovy/apache-groovy-course'
//new File(groovyCourse).eachFileRecurse { file ->
//    // show all first
//    if( file.isFile() && file.name != '.git' ){
//        println file.name
//    }
//
//}


// list only certain files from this directory
//new File('.').eachFile { file ->
//    if( file.name.endsWith('.groovy') ) {
//        println file.name
//    }
//}