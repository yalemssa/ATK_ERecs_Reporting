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
       
       def locations = []
       def locs = AccLoc.findAllByAccId(params.id)
        
       locs.each{
           def l = Locations.get(it.locId)
           StringBuilder locString = new StringBuilder()
            .append(l.building)
            .append(" " + l.room)
            .append(" " + l.co1)
            (l.co1num == 0.0) ? locString.append(" " + l.co1alpha) : locString.append(" " + l.co1num)
            
            locations.add(locString.toString())
       }
       [acc:acc, refs: refs, locations: locations]
   }
}
