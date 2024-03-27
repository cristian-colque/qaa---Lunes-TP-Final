
Feature:página de Inicio

    Background: el usuario accede a la pagina
            Given  el usuario navega a openCart
    @validarHome 
    Scenario Outline: usuario navega a nuestra pagina
    
        When el usuario navega a las <section> usando barra de navegacion
        Then se debe validar pagina de inicio
       
        Examples:
            |section            |
            |Desktops           |
	        |Laptops & Notebooks|
            |Components         |
            |Tablets            |
            |Software           |
	        |Phones & PDAs      |
            |Cameras            |

    @loginValido
    Scenario: validar login correcto
        When navega a la pagina de login
        And ingresa sus datos melopartituras@gmail.com y 1234
        Then validar que el usuario a ingresado a su cuenta
    
    @loginInvalido
     Scenario: validar login Incorrecto
        When navega a la pagina de login
        And ingresa sus datos " " y " "
        Then validar que el usuario a ingreso sus datos de forma incorrecta

    @crearCuenta
    Scenario: crar cuenta de usuario
        When navega a la pagina de registro
        And y se registra de forma correcta  
        Then validar registro correcto

    @crearCuentaInvalida
    Scenario: crar cuenta de usuario invalida
        When navega a la pagina de registro
        And se registra de forma incorrecta
        Then validar registro incorrecto

    @agregarProducto
    Scenario: Agregar un producto a favoritos
        When navega a la pagina de login
        And ingresa sus datos melopartituras@gmail.com y 1234
        And agrega un producto a la lista de deseos
        Then validar que el producto se a agregado a la lista de deseos

    @agregarProductoAlCarrito
    Scenario: Agregar un producto al carrito
        When navega a la pagina de login
        And ingresa sus datos melopartituras@gmail.com y 1234
        And agregar un producto al carrito
        Then validar que el producto se a agregado al carrito



    