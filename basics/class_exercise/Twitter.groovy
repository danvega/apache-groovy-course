def generator = { String alphabet, int n ->
    new Random().with {
        (1..n).collect { alphabet[ nextInt( alphabet.length() ) ] }.join()
    }
}

def randomName = generator( (('a'..'z')+('A'..'Z')+('0'..'9')).join(), 20 )

Tweet tweet = new Tweet(randomName,"Hello, Twitter!")
tweet.addToFavorites()
println tweet

(1..10).each {
    tweet = new Tweet(generator( (('a'..'z')+('A'..'Z')+('0'..'9')).join(), 20 ),"Hello, Twitter!")
    tweet.addToRetweets()
    println tweet
}


('!'..'*').each {
    println it
}