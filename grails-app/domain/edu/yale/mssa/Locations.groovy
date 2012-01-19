package edu.yale.mssa

class Locations {
    long id
    String building
    String room
    String co1
    double co1num
    String co1alpha
    
    static constraints = {
    }
    
    static mapping = {
        table "`LocationsTable`"
        version false
        columns {
            id column : "locationId", type: long
            building column : "building"
            room column : "room"
            co1 column : "coordinate1Label"
            co1num  column : "coordinate1NumericIndicator"
            co1alpha column : "coordinate1AlphaNumIndicator"
        }
    }
}
