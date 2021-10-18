
Scenario Outline: Order checkout para inventario OM, K2K, VA y/o FS con cálculos correctos
Given (dado) que el Customer ingresa a Kometsales App en el módulo “Ecommerce” para <tipo_compañia>
When (cuando) el usuario diligencie el encabezado de la Prebook
And agrege una línea <OM>
And <haga> clic en el botón Check Out del View Cart
And <confirme> el checkout de la <Order>
And <no haga> clic en continuar comprando
Then (entonces) <el usuario se mantiene en el carrito de compras>

Examples: Order con inventario OM con confirmación de Checkout

| tipo_compañia | tipo_inventario | accion_carrito | status_checkout | tipo_order | continue_shopping | resultado_esperado |
| Single Location | OM | haga | confirme | Order | haga | el usuario es mantenido en la misma pantalla |
| Multilocation | OM | haga | confirme | Order | haga | el usuario es mantenido en la misma pantalla |

Examples: Order con inventario OM sin confirmación de Checkout

| tipo_compañia | tipo_inventario | accion_carrito | status_checkout | tipo_order | continue_shopping | resultado_esperado |
| Single Location | OM | haga | no confirme | Order | no haga | el usuario se mantiene en el carrito de compras|
| Multilocation | OM | haga | no confirme | Order | no haga | el usuario se mantiene en el carrito de compras |


# Esquema del escenario: Order checkout para inventario OM, K2K, VA y/o FS con cálculos correctos
# Dado que el usuario Customer ingresa a Kometsales App en el módulo “Ecommerce” con una compañia <tipo_compañia>
#Cuando el usuario diligencie el encabezado de la Prebook
# And agrege una línea <tipo_inventario>
# Entonces se visualiza un <tipo_order> Number en el encabezado
# And el carrito lista el inventario <tipo_inventario>
# And el sistema calcula correctamente los valores y totales