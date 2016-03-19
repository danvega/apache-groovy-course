@groovy.transform.ToString
class TweetFooBar {

    String username // @therealdanvega
    String text
    Integer retweets
    Integer favorites
    
    public TweetFooBar(String user, String tweet) {
        username = user
        text = tweet
        retweets = 0
        favorites = 0
    }

}

def tweet = new TweetFooBar("therealdanvega","Hello, Twitter!")
println tweet