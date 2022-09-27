#include <stdio.h>
#include "include/enroll.h"

const float PI = 3.14;

void main() {
	enroll();
// Circle
	float circle_rad;
	printf("----------------------------------\n");
	printf("-	  Area of Circle	 -\n");
	printf("----------------------------------\n");
	printf("Enter Radius of circle: ");
	scanf("%f",  &circle_rad);
	printf("Area of Circle: %.2f\n\n", circle_rad*circle_rad*PI);

// Rectangle
	float length, width;
	printf("----------------------------------\n");
	printf("-	 Area of Rectangle	 -\n");
	printf("----------------------------------\n");
	printf("Enter Length of Rectangle: ");
	scanf("%f",  &length);
	printf("Enter Width of Rectangle: ");
	scanf("%f", &width);
	printf("Area of Rectangle: %.2f\n\n", length*width);

// Sphere
	float sphere_rad;
	printf("----------------------------------\n");
	printf("-	  Area of Sphere	 -\n");
	printf("----------------------------------\n");
	printf("Enter Radius of Sphere: ");
	scanf("%f",  &sphere_rad);
	printf("Area of Sphere: %.2f\n\n", 4*sphere_rad*sphere_rad*PI);
}
