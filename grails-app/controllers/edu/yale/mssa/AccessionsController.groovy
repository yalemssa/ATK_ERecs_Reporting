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
       
       
       h.each(){
           it.getValue().sort{a,b ->
               if(a.accNum2 == b.accNum2){
                   a.accNum3 <=> b.accNum3
               }
               
               a.accNum2 <=> b.accNum2
           }
       }
       
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
       
        def resources = []
        def acres = AcResources.findAllByAccId(params.id)
        
        acres.each{
            def res = Resources.get(it.resId)
            resources.add(res)
        }
        
        locs.each{
           def l = Locations.get(it.locId)
           StringBuilder locString = new StringBuilder()
            .append(l.building)
            .append(" " + l.room)
            .append(" " + l.co1)
            (l.co1num == 0.0) ? locString.append(" " + l.co1alpha) : locString.append(" " + l.co1num)
            
            locations.add(locString.toString())
       }
       
       [acc:acc, refs: refs, locations: locations, resources: resources]
   }

    def test = {
        def rIds = AccRes.findAllByAccId(6661);
        rIds.each{
            render it + "<br />"
        }
    }
}
