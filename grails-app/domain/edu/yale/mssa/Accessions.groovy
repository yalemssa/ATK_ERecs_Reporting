package edu.yale.mssa

class Accessions {
    Long id
    String accNum1
    String accNum2
    String accNum3
    String accTitle
    Boolean accFlag
    Float accMb
    String accProcessingPlan
    String accProcessingStatus
    Double accExtentNumber
    String accExtentType
    String accContainerSummary
    
    static constraints = {
    }
    
    static mapping = {
        table "`Accessions`"
        version false
        columns {
            id column : "accessionId", type: long
            accNum1 column: "accessionNumber1"
            accNum2 column: "accessionNumber2"
            accNum3 column: "accessionNumber3"
            accTitle column: "title"
            accFlag column: "userDefinedBoolean2"
            accMb column : "userDefinedReal1"
            accProcessingPlan column : "processingPlan"
            accProcessingStatus column : "processingStatus"
            accExtentNumber column : "extentNumber"
            accExtentType column : "extentType"
            accContainerSummary column : "containerSummary"
            
        }
    }
}
