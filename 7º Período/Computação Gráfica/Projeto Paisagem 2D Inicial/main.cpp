// Um programa OpenGL simples que desenha uma paisagem com chão, arvoré, casa e sol
#include <windows.h>
#include <gl/glut.h>
#include <math.h>
// Variáveis para controlar a cor dos elementos da paisagem
int mudarChao = 0;
int mudarCeu = 0;
int mudarFolhaArvore = 0;
int mudarTelhadoTronco = 0;
int mudarPorta = 0;
int mudarEstrutura = 0;
int mudarSol = 0;
// Função para reconhecer Inputs do Teclado
void keyboardInput(unsigned char key, int x, int y){
	if(key == 27){
		exit(0);
	}
	else if(key == 67 || key == 99){
		if(mudarChao == 0){
			mudarChao = 1;
		}
		else{
			mudarChao = 0;
		}
		glutPostRedisplay();
	}
	else if(key == 32){
		if(mudarCeu == 0){
			mudarCeu = 1;
		}
		else{
			mudarCeu = 0;
		}
		glutPostRedisplay();
	}
	else if(key == 70 || key == 102){
		if(mudarFolhaArvore == 0){
			mudarFolhaArvore = 1;
		}
		else{
			mudarFolhaArvore = 0;
		}
		glutPostRedisplay();
	}
	else if(key == 84 || key == 116){
		if(mudarTelhadoTronco == 0){
			mudarTelhadoTronco = 1;
		}
		else{
			mudarTelhadoTronco = 0;
		}
		glutPostRedisplay();
	}
	else if(key == 80 || key == 112){
		if(mudarPorta == 0){
			mudarPorta = 1;
		}
		else{
			mudarPorta = 0;
		}
		glutPostRedisplay();
	}
	else if(key == 69 || key == 101){
		if(mudarEstrutura == 0){
			mudarEstrutura = 1;
		}
		else{
			mudarEstrutura = 0;
		}
		glutPostRedisplay();
	}
	else if(key == 83 || key == 115){
		if(mudarSol == 0){
			mudarSol = 1;
		}
		else{
			mudarSol = 0;
		}
		glutPostRedisplay();
	}
}
// Função callback chamada para fazer o desenho
void DesenhaCirculo(float cx, float cy, float r, int num_segmentos)
{
	if(mudarSol == 1){
		glColor3f(1.0f, 0, 0);
	}
	else{
		glColor3f(1.0f, 0.8f, 0);
	}
	glBegin(GL_LINE_LOOP); // desenha o círculo
	for(int ii = 0; ii < num_segmentos; ii++)
	{
		float theta = 2.0f * 3.1415926f * float(ii) / float(num_segmentos);
		float x = r * cosf(theta); //calcular o componente x
		float y = r * sinf(theta); //calcular o componente y
		glVertex2f(x + cx, y + cy); //vertices de saída
	}
	glEnd();
	glBegin(GL_POLYGON); // preenche o círculo
	for (int i = 0; i < 360; i++) 
	{
		float angle_theta = i * 3.142 / 180;
		glVertex2f(cx + r * cos(angle_theta), cy + r * sin(angle_theta));
	}
	glEnd();
}

void DesenhaCirculoArvore(float cx, float cy, float r, int num_segmentos)
{
	if(mudarFolhaArvore == 1){
		glColor3f(1.0f, 0, 0);
	}
	else{
		glColor3f(0, 0.6f, 0.3f);
	}
	glBegin(GL_LINE_LOOP); // desenha o círculo
	for(int ii = 0; ii < num_segmentos; ii++)
	{
		float theta = 2.0f * 3.1415926f * float(ii) / float(num_segmentos);
		float x = r * cosf(theta); //calcular o componente x
		float y = r * sinf(theta); //calculate o componente y
		glVertex2f(x + cx, y + cy); //vertices de saída
	}
	glEnd();
	glBegin(GL_POLYGON); // preenche o círculo
	for (int i = 0; i < 360; i++) 
	{
		float angle_theta = i * 3.142 / 180;
		glVertex2f(cx + r * cos(angle_theta), cy + r * sin(angle_theta));
	}
	glEnd();
}

void Desenha(void)
{
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
	// Limpa a janela de visualização
	glClear(GL_COLOR_BUFFER_BIT);
	// Especifica que a cor corrente é vermelha
	// R G B
	// Desenha um quadrado para o céu
	if(mudarCeu == 1){
		glColor3f(0, 0, 0);
	}
	else{
		glColor3f(1.0f, 1.0f, 1.0f);
	}
	glBegin(GL_QUADS);
		glVertex2i(480,0);
		glVertex2i(0,0);
		glVertex2i(0,400);
		glVertex2i(480,400);
	glEnd();
	// Desenha um quadrado para o chão
	if(mudarChao == 1){
		glColor3f(1.0f, 0, 0);
	}
	else{
		glColor3f(0, 0.6f, 0.3f);
	}
	glBegin(GL_QUADS);
		glVertex2i(0,120);
		glVertex2i(0,0);
		glVertex2i(480,0);
		glVertex2i(480,120);
	glEnd();
	// Desenha um quadrado para o tronco da árvore
	if(mudarTelhadoTronco == 1){
		glColor3f(1.0f, 0, 0);
	}
	else{
		glColor3f(0.8f, 0.6f, 0.5f);
	}
	glBegin(GL_QUADS);
		glVertex2i(45,120);
		glVertex2i(55,120);
		glVertex2i(55,170);
		glVertex2i(45,170);
	glEnd();
	// Desenha um quadrado para a estrutura da casa
	if(mudarEstrutura == 1){
		glColor3f(1.0f, 0, 0);
	}
	else{
		glColor3f(0, 0.7f, 1.0f);
	}
	glBegin(GL_QUADS);
		glVertex2i(160,120);
		glVertex2i(215,120);
		glVertex2i(215,170);
		glVertex2i(160,170);
	glEnd();
	// Desenha um quadrado para o telhado da casa e transforma-o em triângulo
	if(mudarTelhadoTronco == 1){
		glColor3f(1.0f, 0, 0);
	}
	else{
		glColor3f(0.8f, 0.6f, 0.5f);
	}
	glBegin(GL_QUADS);
		glVertex2i(150,170);
		glVertex2i(225,170);
		glVertex2i(185,200);
		glVertex2i(185,200);
	glEnd();
	// Desenha um quadrado para a porta da casa
	if(mudarPorta == 1){
		glColor3f(1.0f, 0, 0);
	}
	else{
		glColor3f(0.8f, 0.6f, 0.5f);
	}
	glBegin(GL_QUADS);
		glVertex2i(180,120);
		glVertex2i(195,120);
		glVertex2i(195,145);
		glVertex2i(180,145);
	glEnd();
	
	DesenhaCirculo(110,220,10,500);
	// Desenha linhas para os raios do sol
	if(mudarSol == 1){
		glColor3f(1.0f, 0, 0);
	}
	else{
		glColor3f(1.0f, 0.8f, 0);
	}
	glLineWidth(3);
	glBegin(GL_LINES);
		glVertex2i(95,205);
		glVertex2i(100,210);
		
		glVertex2i(110,207);
		glVertex2i(110,200);
		
		glVertex2i(120,210);
		glVertex2i(125,205);	
		
		glVertex2i(125,220);
		glVertex2i(132,220);
		
		glVertex2i(88,220);
		glVertex2i(95,220);
		
		glVertex2i(96,238);
		glVertex2i(101,231);
		
		glVertex2i(120,230);
		glVertex2i(125,235);
		
		glVertex2i(110,233);
		glVertex2i(110,240);
	glEnd();
	
	DesenhaCirculoArvore(50,175,10,500);
	DesenhaCirculoArvore(35,165,10,500);
	DesenhaCirculoArvore(65,165,10,500);
	
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
	glutCreateWindow("Projeto Paisagem");
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutDisplayFunc(Desenha);
	glutReshapeFunc(AlteraTamanhoJanela);
	glutKeyboardFunc(keyboardInput);
	glutInitWindowPosition(350, 100);
	// tamanho em pixels da janela
	glutInitWindowSize(640,480); 
	Inicializa();
	glutMainLoop();
}
