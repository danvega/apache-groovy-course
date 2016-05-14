package groovy

// Right away Groovy is going to make our lives easier when it comes to creating threads
// A Closure in groovy implements Runnable. This means that we can create a new thread pretty easily

def t = new Thread() { /* do something */ }
t.start()

// Show Thread GDK
// This means that we can simplify the code above to

Thread.start { /* do something */ }
Thread.start('thread-name') { /* do something */ }

// In Java you can create a daemon thread and therefor in Groovy you can do the same.
// A daemon thread is one that runs in the background and isn't tied to a program. This means a program can exit
// with daemon threads still running

Thread.startDaemon { /* do something */ }
Thread.startDaemon('thread-name') { /* do something */ }

