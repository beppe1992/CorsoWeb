# CorsoWeb
Questo progetto è stato utilizzato per fare un mini-corso web, ed è composto dai seguenti sotto progetti.<br>

<b> TUTTI I PROGETTI HANNO BISOGNO DI UN WEB SERVER (ES. TOMCAT) PER POTER ESSERE ESEGUITI</b>
<b> SU GDRIVE E' INOLTRE PRESENTE ALTRA DOCUMENTAZIONE UTILE</b>

## EsempioSpringJsf
In questo progetto è presente un esempio di integrazione tra JSF e Spring base, in particolare viene presentato un form di registrazione<br>

### Link
Il link alla pagina è http://locahost:8080/EsempioSpringJsf/FormDiEsempio.xhtml

## EsempioSpringMVC
In questo progetto è presente un esempio di utilizzo di Spring MVC. E' presente una pagina di indice attraverso la quale è possibile accedere a tutti gli esemi:<br>
1. Chiamata ad un controller che fa semplicemente un Forward<br>
2. Chiamata ad un controller che stampa un messaggio standard a console<br>
3. Chiamata ad un controller che stampa un messaggio passato nell'url della chiamata come parametro<br>
4. Chiamata ad un controller che reindirizza ad una nuova pagina e stampa in pagina le informazioni di un libro standard<br>
5. Chiamata ad un controller che reindirizza ad una nuova pagina e stampa in pagina le informazioni di un libro avente come titolo quello passato nell'url come parametro<br>
6. Esegue la stessa cosa dell'esempio 4 ma con una logica differente (usa l'oggetto ModelAndView)<br>
7. Esegue la stessa cosa dell'esempio 4 ma con una logica differente (usa l'oggetto ModelAndView e il Libro è un'oggetto anzi che solo variabili stringa)<br>
8. Visualizza un form standard jsp compilabile, nel quale attraverso il submit viene chiamato il controller<br>
9. Visualizza un esempio di gestione di errori<br>
10. Esegue la stessa cosa dell'esempio 8 ma utilizzando un form Spring Web<br>


### Link
Il link a  pagina di "Welcome" è http://localhost:8080/EsempioSpringMVC/home

## EsempioSpringWebFlow
In questo progetto è presente un esempio di utilizzo di Spring Web Flow. Tutti gli esemi sono richiamabili attraverso un URL specifico:<br>
1. Reindirizzamento nei flow corretti (Accedendo a due link diversi si viene indirizzati nei due diversi flow)<br>
2. Esempio base con BackingBean (Guardiamo l’esempio di un form con un backingBean sottostante)<br>
3. Esempio con BackingBean prevalorizzato (Guardiamo l’esempio di un form con un backingBean sottostante e la prevalorizzazione del form)<br>
4. Esempio con transition semplice<br>
5. Esempio con transition e set di una variable (Guardiamo un esempio di transition con il setting di una variabile: la variabile viene poi pubblicata in pagina)<br>
6. Esempio con transition ed evaluate <br>
7. Esempio onStart(Guardiamo un esempio di come recuperare parametri passati in input via GET o POST)<br>
8. Esempio Decision(Passando in input l’utente Giuseppe viene visualizzata la pagina, altrimenti viene visualizzata una pagina di errore)<br>
9. Esempio Action State (Digitando sul campo di input “rimaniQui” non viene cambiata la pagina, digitando “nuovaPagina” si va in un’altra pagina)<br>
10.Esempio Global Transition (Accedendo alle due pagine di dettaglio il pulsante “home” riporta allo stesso punto senza dover gestire la navigazione nei due diversi view-state)<br>
11.Esempio di transazione tra diversi flow<br>


### Link
Esempio 1: http://localhost:8080/EsempioSpringWebFlow/spring/indiceBiblioteca e http://localhost:8080/EsempioSpringWebFlow/spring/indiceOfficina
Esempio 2: http://localhost:8080/EsempioSpringWebFlow/spring/esempioConBean
Esempio 3: http://localhost:8080/EsempioSpringWebFlow/spring/esempioConBeanConInit
Esempio 4: http://localhost:8080/EsempioSpringWebFlow/spring/esempioTransition
Esempio 5: http://localhost:8080/EsempioSpringWebFlow/spring/esempioTransition
Esempio 6: http://localhost:8080/EsempioSpringWebFlow/spring/esempioTransition
Esempio 7: http://localhost:8080/EsempioSpringWebFlow/spring/esempioOnStart
Esempio 8: http://localhost:8080/EsempioSpringWebFlow/spring/esempioDecision
Esempio 9: http://localhost:8080/EsempioSpringWebFlow/spring/esempioActionState
Esempio 10: http://localhost:8080/EsempioSpringWebFlow/spring/esempioGlobalTransition
Esempio 11: http://localhost:8080/EsempioSpringWebFlow/spring/esempioPassaggioTraFlowIn
