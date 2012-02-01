package edu.yale.mssa

class AcResources {
    long id
    long accId
    long resId

    
    static constraints = {
    }
    
    static mapping = {
        table "`AccessionsResources`"
        version false
        columns {
            id column: "accessionsResourcesId", type: long
            accId column: "accessionId", type: long
            resId column: "resourceId", type: long
        }
    }
}
