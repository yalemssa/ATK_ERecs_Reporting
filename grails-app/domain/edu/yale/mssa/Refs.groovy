package edu.yale.mssa

class Refs {
    Long id
    String descriminator
    String repeatingDataType
    String title
    String href
    Long accessionId
    
    static constraints = {
    }
    
    static mapping = {
        table "`ArchDescriptionRepeatingData`"
        version false
        columns {
            id column : "archDescriptionRepeatingDataId", type: long
            descriminator column : "descriminator"
            repeatingDataType column : "repeatingDataType"
            title column : "title"
            href column : "href"
            accessionId column : "accessionId"
        }
    }
}
