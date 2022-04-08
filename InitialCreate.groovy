import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.RoundedCube

//Your code here

CSG roundedCube = new RoundedCube(	40,// X dimention
				40,// Y dimention
				40//  Z dimention
				)
				.cornerRadius(4)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
				
				
roundedCube.addExportFormat("stl")
roundedCube.addExportFormat("svg")
return roundedCube