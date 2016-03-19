@groovy.transform.ToString
class Tweet {

    String username // @therealdanvega
    String text
    Integer retweets
    Integer favorites
    Date createdOn
    
    public Tweet(String user, String tweet) {
       username = user
       text = tweet
       retweets = 0
       favorites = 0
       createdOn = new Date()
    }
    
    void addToRetweets(){
        retweets += 1
    }
    void addToFavorites(){
        favorites += 1
    }

}

def tweet = new Tweet("@therealdanvega","Hello, Twitter")
println tweet
