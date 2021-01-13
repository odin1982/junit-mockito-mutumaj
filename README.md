# junit-mockito-mutumaj

## Defining unit testing
```bash
Un test es una evaluación,una TestClass es la validación de un requerimiento funcional o no funcional antes de que sea entregado
al cliente.

Ventajas de JUnit 4:
	- en vez de heredar de junit.framework.Testcase, cualquier clase debe ser una clase test
	- setUp y tearDown son remplazados por @Before y @After
	- cualquier metodo publico anotado con @Test puede ser un metodo test
```

## Exploring annotations

@Test 
	Representa un test.
	Cualquier metodo publico puede ser anotado con @Test.
	No hay necesidad de empezar los nombres de los metodos con test.

setUp()
	Si necesitamos datos para verificar nuestro codigo se debe realizar en este metodo.
	
	protected void setUp() throws Exception

@Before
	Si en un metodo publico ponemos la anotacion @Before,cada test usara este metodo antes de su ejecución

@After
	Lo mismo que @Before pero este se ejecutara despues de cada metodo test

@BeforeClass
@AfterClass
	Estas se ejecutaran una vez antes y despues de cada clase respectivamente y debe ser un metodo public static void
	
	
	@BeforeClass
	public static void [nombreTest](){
	
	}


NOTA: Es una buena practica crear clases con el sufijo Test	 

## Assertion
	Son usadas para verificar un supuesto resultado de una implementaci�n.

Paquete usado por JUnit: 
				org.junit.Assert



## @RunWith
	Se usa para cambiar la naturaleza del test ya que se puede definir un test para Mockito o para Spring

## @Ignore
	Se usa para ignorar el test y se le puede agragar un mensaje para documentar el motivo


