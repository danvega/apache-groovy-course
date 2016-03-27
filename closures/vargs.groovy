/*
String concat(String... args) {
    args.join('')
}
*/

def concat = { String... args ->
    args.join('')
}

assert concat('abc','def') == 'abcdef'
assert concat('abc','def','123','456') == 'abcdef123456'