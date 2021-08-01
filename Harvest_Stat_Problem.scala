object HarvestStatProblem{
    var harvest = Array.ofDim[Int](4,7)
    var min = 0
    var max = 0
    var maxWeek = 0
    var maxDay = 0
    var minWeek = 0
    var minDay = 0
    var total = 0
    var count = 0
    var avg = 0
  
    var week= Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" )
	
	
    def printVal(){
      print("	")
      for(i<-0 to 6)
      {
        print(week(i)+" ")
      }
      println()

      for(i<- 0 to 3){
 	  print("Week"+(i+1)+"	")
          for(j<- 0 to 6){
             print(harvest(i)(j)+ "	")
          }
          println()
       }
      print("\n--------------------------------------\n")
    }
    

    def AvgVal(){
          println("Weekly average")
          for(i<- 0 to 3){
              for(j<- 0 to 6){
                  total += harvest(i)(j)            
                  count = count +1 
              }
              avg = total / count
              print(" Week"+(i+1)+ ": average = "+avg+ "\n")
          }
     print("\n------------------------------------------------\n")
    }
    
    
    
    def main(args:Array[String]){
        harvest  = Array( Array(71, 19, 44, 56, 79, 43, 14), Array(64, 22, 73, 46, 67, 4, 81), Array(45, 18, 34, 92, 44, 84, 76), Array(19, 66, 67, 49, 99, 75, 30) )
        
        printVal()

        min = harvest(0)(0)
        for(i<- 0 to 3){
           for(j<- 0 to 6){
               if(min >= harvest(i)(j)){
                   min = harvest(i)(j)
                   minDay = j
                   minWeek = i
               }
           }
        }
        println("Minimum harvest of the month is "+min+" and it occurs in the week "+minWeek+" and it is "+week(minDay))
	print("--------------------------------------\n")

        max = harvest(0)(0)
        for(i<- 0 to 3){
            for(j<- 0 to 6){
                if(max <= harvest(i)(j)){
                    max = harvest(i)(j)
                    maxDay = j
                    maxWeek = i
                }
            }
        }
        println("Maximum harvest of the month is "+max+" and it occurs in the week "+maxWeek+ " and it is "+week(maxDay))
	print("---------------------------------------------------\n")
	
	var range = max - min
  	println("The range is : "+range)
	print("---------------------------------------------------\n")
	
        AvgVal()
    }
}