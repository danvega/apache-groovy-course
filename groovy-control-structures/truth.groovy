// Boolean
assert true
assert !false

// Matcher
assert ('a' =~ /a/)
assert !('a' =~ /b/)

// Collection
assert [1]
assert ![]

// Map
assert [1:'one']
assert ![:]

// String
assert 'a'
assert !''

// Number
assert 1
assert 3.5
assert !0

// None of the above 
assert new Object()
assert !null