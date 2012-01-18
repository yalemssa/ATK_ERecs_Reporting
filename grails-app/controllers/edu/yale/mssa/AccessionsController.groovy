package edu.yale.mssa

class AccessionsController {

   def list = {
       def accs = Accessions.findAllByAccFlag(true)
       [accs:accs]
   }
}
