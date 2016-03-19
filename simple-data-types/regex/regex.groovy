// Java Sample Pattern

import java.util.regex.*;
Pattern pattern = Pattern.compile("a\\\\b")
println pattern
println pattern.class

// What patterns will look like in Groovy

String slashy = /a\b/
String url = $/http://threaldanvega.com/blog/$

println slashy.class

def pattern = ~/a\b/
println pattern.class

// Find | Match

def text = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern = ~/Cleveland Sports Fan/
def finder = text =~ pattern
def matcher = text ==~ pattern

println finder
println finder.size()
println matcher

// ----------------------------------------------------------------------------------

def text = "Cleveland Sports Fan"
def pattern = ~/Cleveland Sports Fan/
def matcher = text ==~ pattern

println matcher

if( matcher ) { // do something }


// ----------------------------------------------------------------------------------

def text = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern = ~/Cleveland/

text = text.replaceFirst(pattern,"Buffalo")
println text
