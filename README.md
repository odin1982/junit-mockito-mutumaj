# junit-mockito-mutumaj

## Defining unit testing
```bash
Un test es una evaluacion,una TestClass es la validacion de un requerimiento funcional o no funcional antes de que sea entregado
al cliente.

Ventajas de JUnit 4:
	- en vez de heredar de junit.framework.Testcase, cualquier clase debe ser una clase test
	- setUp y tearDown son remplazados por @Before y @After
	- cualquier metodo publico anotado con @Test puede ser un metodo test
```

## Exploring annotations

## @Test
``` 
	Representa un test.
	Cualquier metodo publico puede ser anotado con @Test.
	No hay necesidad de empezar los nombres de los metodos con test.
```

## setUp()
```
	Si necesitamos datos para verificar nuestro codigo se debe realizar en este metodo.
	
	protected void setUp() throws Exception
```

## @Before
```
	Si en un metodo publico ponemos la anotacion @Before,cada test usara este metodo antes de su ejecuciÃ³n
```
## @After
```
	Lo mismo que @Before pero este se ejecutara despues de cada metodo test
```
## @BeforeClass,@AfterClass
```
	Estas se ejecutaran una vez antes y despues de cada clase respectivamente y debe ser un metodo public static void
	
	
	@BeforeClass
	public static void [nombreTest](){
	
	}

```
NOTA: Es una buena practica crear clases con el sufijo Test	 

## Assertion
```
	Son usadas para verificar un supuesto resultado de una implementación.

Paquete usado por JUnit: 
				org.junit.Assert
```

## @RunWith
```
	Se usa para cambiar la naturaleza del test ya que se puede definir un test para Mockito o para Spring
```

## @Ignore
```
	Se usa para ignorar el test y se le puede agragar un mensaje para documentar el motivo
```

## Executing test in order
```
	JUnit permite executar los test de forma aleatoria
	To change the execution order, annotate your test class using @FixMethodOrder and
	specify one of the following available enum MethodSorters constant:

	• MethodSorters.JVM: 
		This leaves the test methods in the order returned by the JVM. This order may 		vary from run to run.
	• MethodSorters.NAME_ASCENDING: 
		This sorts the test methods by the method name in the lexicographic order.
	• MethodSorters.DEFAULT: 
		This is the default value that doesn't guarantee the execution order.
```
		
## Assume
```
  Assume si la condicion se cumple, se ejecuta el test, si no se cumple lo ignora,
  podria ser un ignore condicionado a cierto estatus o circunstancia
  si isSonarRunning = false se ejecuta sino no se ignora el test
  
  public class Assumption {
	boolean isSonarRunning = false;
	
	* vease clase Assumption 
```
	
