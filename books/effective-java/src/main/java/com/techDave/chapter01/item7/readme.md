
# Eliminate Obsolete Object References

- An obsolete reference is simply a reference that will never be dereferenced again. 
- The  fix  for  this  sort  of  problem  is  simple:  null  out  references  once  they become obsolete.
- The  fix  for  this  sort  of  problem  is  simple:  null  out  references  once  they become obsolete.
- The best way to eliminate an obsolete reference is to let the variable that contained the reference fall out of scope. (Item 57)
- whenever  a  class  manages  its  own  memory,  the  pro-
grammer should be alert for memory leaks.
- Another  common  source  of  memory  leaks  is  caches.
- A third common source of memory leaks is listeners and other callbacks.


- QUE?
  - Un objeto que ya no necesitas, pero que sigue siendo referenciado por alguna variable.
  - En Java, el GC solo elimina objetos que no tienen ninguna referencia activa, si mantienes una referencia sin querer → ese objeto no se libera → fuga de memoria.

- Regla General:
  - ✔️ Lo ideal: dejar que las variables salgan de scope (alcance)
  - ❗ Pero cuidado: si tú manejas memoria manualmente (arrays, pools, caches…), debes limpiar referencias tú mismo.

- Cuando Preocuparse:
  - Clases que manejan su propia memoria (tiene structura interna como arrays, buffers, pools)
  - Caches (usa WeakHashMap): ``
    - Guardas cosas
    - Nunca las eliminas
    - La memoria crece indefinidamente
  - Listeners / Callbacks
    - El listener queda referenciado → fuga de memoria

- Idea profunda: El GC NO sabe q objeto ya no necesitas, solo sabe si hay referencia o no.
  - Una fuga de memoria en Java no es “falta de free()”, sino referencias que nunca se liberan.
- Regla Mental 
  - Asking: ¿Este objeto todavía puede ser usado en el futuro?