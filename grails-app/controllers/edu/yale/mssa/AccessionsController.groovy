package edu.yale.mssa

class AccessionsController {

   def list = {
       def accs = Accessions.findAllByAccFlag(true)
       Map<String, ArrayList<Accessions>>  h= new TreeMap<String, ArrayList<Accessions>>()
       def mb = [:]
       accs.each{
           if(! h.containsKey(it.accNum1))
            h.put(it.accNum1, new ArrayList<Accessions>())
     
           h.get(it.accNum1).add(it)
       }
       
       
       h.sort()
       
       h.each{
           float total = 0.0;
           def year = it.getValue()
           year.each{x ->
               if (x.accMb != null)
                total += x.accMb
           }
           mb.putAt(it.getKey(), total)
       } 
       
       [accYears: h, mb: mb]
   }
   
   def show = {
       def acc = Accessions.get(params.id)
       def refs = Refs.findAllByAccessionId(params.id)
       [acc:acc, refs: refs]
   }
}
