// Quadrado.c
// Um programa OpenGL simples que desenha um
// quadrado em uma janela GLUT.
#include <windows.h>
#include <gl/glut.h>
// Função callback chamada para fazer o desenho
void Desenha(void)
{
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
	
	// Limpa a janela de visualização
	glClear(GL_COLOR_BUFFER_BIT);
	
	// Especifica que a cor corrente é vermelha
	// R G B
	glColor3f(1.0f, 0.0f, 0.0f);
	
	// Desenha um quadrado na cor corrente
	glBegin(GL_QUADS);
		glVertex2i(100,150);
		glVertex2i(100,100);
		// Especifica que a cor corrente é azul
		glColor3f(0.0f, 0.0f, 1.0f);
		glVertex2i(150,100);
		glVertex2i(150,150);
	glEnd();
	
	glBegin(GL_LINE_STRIP);
		glVertex2f(0.2, 0.6);
		glVertex2f(0.2, 0.90);
		glVertex2f(0.35, 0.90);
		glVertex2f(0.35, 0.75);
	glEnd ( );
	
	// Executa os comandos OpenGL
	glFlush();
}

// Inicializa parâmetros de rendering
void Inicializa (void)
{
	// Define a cor de fundo da janela de visualização como preta
	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
}
// Função callback chamada quando o tamanho da janela é alterado
void AlteraTamanhoJanela(GLsizei w, GLsizei h)
{
	// Evita a divisao por zero
	if(h == 0) h = 1;
	
	// Especifica as dimensões da Viewport
	glViewport(0, 0, w, h);
	
	// Inicializa o sistema de coordenadas
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	
	// Estabelece a janela de seleção (left, right, bottom, top)
	if (w <= h)
		gluOrtho2D (0.0f, 250.0f, 0.0f, 250.0f*h/w);
	else
		gluOrtho2D (0.0f, 250.0f*w/h, 0.0f, 250.0f);
}
// Programa Principal
int main(int argc, char** argv) {
	glutInit(&argc, argv); // Initialize GLUT
	/*
	avisa a GLUT que tipo de modo de exibição deve ser usado quando a janela é criada. 
	Neste caso os argumentos indicam a criação de uma janela single-buffered (GLUT_SINGLE) 
	com o modo de cores RGBA (GLUT_RGB). O primeiro significa que todos os comandos de desenho 
	são feitos na janela de exibição. Uma alternativa é uma janela double-buffered, onde os 
	comandos de desenho são executados para criar uma cena fora da tela para depois rapidamente 
	colocá-la na view (ou janela de visualização). Este método é geralmente utilizado para produzir 
	efeitos de animação. O modo de cores RGBA significa que as cores são especificadas através do 
	fornecimento de intensidades dos componentes red, green e blue separadas.
	*/
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); 
	glutInitWindowSize(400,350); //especifica o tamanho em pixels da janela GLUT
	glutInitWindowPosition(10,10); //especifica a localização inicial da janela GLUT, que neste caso é o canto superior esquerdo da tela do computador [Woo 1999]
	glutCreateWindow("Quadrado");
	glutDisplayFunc(Desenha);
	/*
	estabelece a função "AlteraTamanhoJanela" previamente definida como a 
	função callback de alteração do tamanho da janela. Isto é, sempre que 
	a janela é maximizada, minimizada, etc., a função "AlteraTamanhoJanela" 
	é executada para reinicializar o sistema de coordenadas.
	*/
	glutReshapeFunc(AlteraTamanhoJanela); 
	Inicializa();
	glutMainLoop();
}
