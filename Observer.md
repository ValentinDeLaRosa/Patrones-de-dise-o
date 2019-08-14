# Observer Pattern


Es un patrón de diseño de software de comportamiento.  Se trata de una dependencia de tipo uno a muchos entre los objetos, logrando así que, 
cuando uno de los objetos cambia su estado (sujeto), notifica este cambio a todos los dependientes (observadores).  Útil cuando se quiere
informar de algún cambio de una característica de una objeto a otros, de forma ágil, por ejemplo, en in videojuego, un jugador (sujeto) 
notifica sus estadísticas en tiempo real a otros jugadores (observadores)

# Elementos importantes 🔧
## Sujeto
Es aquel de quién van a obtener notificación los observadores, así, si este cambia algún estado, notificará a todos los observadores para
que hagan lo correspondiente al cambio de estado dado

## Observador
Los observadores reciben la notificación de cambio de estado, y actúan según la notificación que reciban, por ejemplo, si en un videojuego
un observador recibe la notificación de que uno de sus compañeros (sujeto) cambió su estado de "vivo" a "muerto", podría hacer que el observador
tenga un parpadeo gris en la pantalla como respuesta a la notificación recibida.

# Uso 📋
1. Se debe definir cuál será el sujeto y cuál el observador
2. El sujeto debe almacenar, de alguna forma, quienes son sus observadores
3. Se debe implementar una función para que el sujeto notifique un cambio a todos los observadores
4. Se debe implementar una forma en que los observadores actúan según la notificación recibida por el sujeto, la cuál está dada por un cambio de estado.


