# OOP-Task
Manage your oop task with this repository

### Depedencies
- JDK
- Netbeans
- Visual Studio Code

### Features

code opengl grafkom
```
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdarg.h>
#include <GL/glut.h>

void tampilan(void) {
	glClearColor(1.0, 1.0, 1.0, 0.0); // warna display
	glMatrixMode(GL_PROJECTION);
	gluOrtho2D(0.0, 300.0, 0.0, 300.0);
}

void aturPixel(GLint xCoordinate, GLint yCoordinate) {
	glBegin(GL_POINTS); //membuat titik
	glVertex2i(xCoordinate, yCoordinate);
	glEnd();
	glFlush();
}

void garisBresenham(GLint x0, GLint y0, GLint xEnd, GLint yEnd) {
	GLint dx = (float) fabs((float) xEnd - x0); //Hitung dx
	GLint dy = (float) fabs((float) yEnd - y0); //Hitung dy
	GLint p = 2 * dy - dx; //Hitung parameter : p = 2dy � dx
	GLint twoDy = 2 * dy; //Hitung twoDy = 2 * dy
	GLint twoDyMinusDx = 2 * (dy - dx); //Hitung twoDyDx = 2dy - 2dx / 2 * (dy - dx)
	GLint x, y;

	if (x0 > xEnd) {
		// pk < 0
		x = xEnd;
		y = yEnd;
		xEnd = x;
	} else {
		x = x0;
		y = y0;
	}

	aturPixel(x, y);

	while (x < xEnd) {
		x++; //xk+1
		if (p<0)
			p += twoDy; //pk= pk + 2dy
		else {
			y++; //yk+1
			p += twoDyMinusDx; //pk= pk + twoDyDx
		}

		aturPixel(x, y);
	}
}

void gambarGaris(void) {
	glClear(GL_COLOR_BUFFER_BIT);

	glColor3f(1.0, 0.0, 0.0); //warna garis
	glPointSize(4.0); //ukuran titik
	GLint x0 = 100; //x0
	GLint y0 = 100; //y0
	GLint xEnd = 170; //x1
	GLint yEnd = 160; //x1

	garisBresenham(x0, y0, xEnd, yEnd);
}

int main(int argc, char** argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutInitWindowSize(400, 400);
	glutInitWindowPosition(0, 0);
	glutCreateWindow("Digital Differential Analyzer Algorithm");
	tampilan();
	glutDisplayFunc(gambarGaris);
	glutMainLoop();
	return 0;
}
```
