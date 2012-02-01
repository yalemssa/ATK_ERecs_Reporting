package edu.yale.mssa

class Resources {
    long id
    String title
    String resourceId1
    String resourceId2
    String resourceId3
    
    static constraints = {
    }
    
    static mapping = {
        table "`Resources`"
        version false
        columns {
            id column: "resourceId", type: long
            title column: "title"
            resourceId1 column: "resourceIdentifier1"
            resourceId2 column: "resourceIdentifier2"
            resourceId3 column: "resourceIdentifier3"
        }
    }
}