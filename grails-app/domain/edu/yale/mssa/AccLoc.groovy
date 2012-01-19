package edu.yale.mssa

class AccLoc {
    long id
    long locId
    long accId

    static constraints = {
    }
    
    static mapping = {
        table "`AccessionsLocations`"
        version false
        columns {
            id column : "accessionsLocationsId", type: long
            locId column : "locationId"
            accId column: "accessionId"
        }
    }
}
