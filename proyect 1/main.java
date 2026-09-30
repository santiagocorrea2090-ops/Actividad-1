{
estudiante objest1 =new estudainte ("Santiago", "197456945",20,"ingeneria en sistemas")
estudiante objest1 =new estudainte ("Camilo", "1108566989",22,"ingeneria en sistemas")
estudiante objest1 =new estudainte ("Alex", "1200566487",24,"ingeneria en sistemas")

//mostrar la infroamcion del objeto
System.out.println(objest1);
System.out.println(objest2);
System.out.println(objest3);
//uso de los metodos get y set

System.out.printlnt(objest1,getedad());//20
System.out.printlnt(objest1,getedad());//18

//cambiar el nombre del "objest2"
objest2.setnombre ("yurany urquijo");
    
System.out.println(objest2);//estudiante[nombre: yurany urquijo, documento: 1108566989, edad: 18, programa: ingeneria en sistemas]

//validar con el metdo setEdad que la edad sea mayor o igual a cero
objEst1.setEdad(30);
System.out.println(objEst1)
objEst1.setEdad(-30)://edad tiene q ser mayor o igual a cero

//validar con el metodo setNombre para que nose cree un nombre vacio
objEst2.setnombre(""); //nombre vacio
objEst2. setNombre("amparo");
System.out.println(objEst2)

}