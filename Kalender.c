#include <stdio.h>
#include <stdlib.h>


typedef struct {
	int year;
	int month;
	int day;
}Date;

typedef struct {
	Date* date;
	char* titel;
}Event;

Date* Date_init(int day, int month , int year){

	Date* new_data= malloc (sizeof(Date));

	new_data-> year = year;
	new_data->month = month;
	new_data->day= day;

	return new_data;

}


Event* Event_init (char* titel){

	Event* new_Event = malloc (sizeof(Event));
	new_Event->titel= titel;

	return new_Event;

}


void destroy_Event(Event* event){

	free(event->date);
	free(event->titel);
	free(event);

}


 int main(int argc, char const *argv[]){

	int day,month ,year;

	Event* event= Event_init(malloc(sizeof(char)* 255));

	printf("Bitte geben sie einen Termin ein: \n");
	scanf("%d %d %d %s",&day,&month,&year,event-> titel );

	event->date = Date_init(day,month,year);

	printf("Der Termin in dem Datum (%d %d %d) ist : %s",event->date->day,
											event->date->month
										   ,event->date->year,event->titel);
	destroy_Event(event);

	return 0;

}
