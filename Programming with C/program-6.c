#include "include/enroll.h"

const float PI = 3.14;

void area_of_circle()
{
	float circle_rad;
	printf("----------------------------------\n");
	printf("-         Area of Circle         -\n");
	printf("----------------------------------\n");
	printf("Enter Radius of circle: ");
	scanf("%f", &circle_rad);
	printf("Area of Circle: %.2f\n\n", circle_rad * circle_rad * PI);
}

void area_of_rectangle()
{
	float length, width;
	printf("----------------------------------\n");
	printf("-	 Area of Rectangle	 -\n");
	printf("----------------------------------\n");
	printf("Enter Length of Rectangle: ");
	scanf("%f", &length);
	printf("Enter Width of Rectangle: ");
	scanf("%f", &width);
	printf("Area of Rectangle: %.2f\n\n", length * width);
}

void area_of_sphere()
{
	float sphere_rad;
	printf("----------------------------------\n");
	printf("-	  Area of Sphere	 -\n");
	printf("----------------------------------\n");
	printf("Enter Radius of Sphere: ");
	scanf("%f", &sphere_rad);
	printf("Area of Sphere: %.2f\n\n", 4 * sphere_rad * sphere_rad * PI);
}

void main()
{
	enroll();
	area_of_circle();
	area_of_rectangle();
	area_of_sphere();
}
