#include <windows.h>
#include <gl/glut.h>
#include <math.h>
#include <iostream>

GLfloat x = 100.0f;
GLfloat y = 150.0f;
GLsizei d = 50;
GLfloat passox = 1.0f;
GLfloat passoy = 1.0f;
GLfloat largura;
GLfloat altura;

void Triangulo(){
	glBegin(GL_TRIANGLES);
		glColor3f(1.0f, 0.0f, 0.0f);
		glVertex2i(x,y);
		glColor3f(0.0f, 1.0f, 0.0f);
		glVertex2i(x+d,y+d);
		glColor3f(0.0f, 0.0f, 1.0f);
		glVertex2i(x+d+d,y);
	glEnd();
}

void Desenha(void){
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
	glClearColor(1,1,1,0);
	// Limpa a janela com a cor de fundo
	glClear(GL_COLOR_BUFFER_BIT);
	// Triangulo com uma cor a partir de cada v?rtice
  	Triangulo();
    // Redesenha a cena
    glutSwapBuffers();
}

void Timer(int value){
	// Verifica se o movimento ultrapassa os limites da janela
    if (x + passox + 2 * d > largura || x + passox < 0) {
        passox = -passox; // inverte o sentido do movimento em x se ultrapassar os limites
    }
    if (y + passoy + d > altura || y + passoy < 0) {
        passoy = -passoy; // inverte o sentido do movimento em y se ultrapassar os limites
    }
    // Muda (x,y) movendo o desenho
	x += passox;
	y += passoy;
	glutPostRedisplay(); //Redesenha
	glutTimerFunc(15, Timer, 1); //Aguarda 33 ms e volta
}

void AlteraTamanhoJanela(GLsizei w, GLsizei h){
	if(h == 0) h = 1;
	glViewport(0, 0, w, h);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	if (w <= h) {
		altura = 250.0f*h/w;
		largura = 250.0f;
	}
	else {
		largura = 250.0f*w/h;
		altura = 250.0f;
	}
	gluOrtho2D(0.0f, largura, 0.0f, altura);
}

int main(int argc, char** argv) {
    // Inicializa o GLUT e cria uma janela
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB);
    glutInitWindowSize(400, 400);
    glutCreateWindow("Triângulo Polícolor");
    // Registra as funções de callback
    glutDisplayFunc(Desenha);
    glutIdleFunc(Desenha);
    glutTimerFunc(15, Timer, 1);
    glutReshapeFunc(AlteraTamanhoJanela);
   	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    // Entra no loop de renderização
    glutMainLoop();
    return 0;
}
