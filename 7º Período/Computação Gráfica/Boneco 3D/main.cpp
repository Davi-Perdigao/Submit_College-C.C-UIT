#include <GL/glut.h>

GLfloat ombro = 0.0f;
GLfloat cotovelo = 0.0f;

void desenhaBoneco()
{
    // Cabeça (Esfera)
    glColor3f(1.0f, 1.0f, 0.0f);
    glPushMatrix();
    glTranslatef(0.0f, 0.7f, 0.0f);
    glutWireSphere(0.3f, 16, 16);
    glPopMatrix();

    // Corpo (Cilindro)
    glColor3f(0.0f, 0.0f, 1.0f);
    glPushMatrix();
    glTranslatef(0.0f, 0.0f, 0.0f);
    glScalef(0.4f, 0.6f, 0.2f);
    glutWireCube(1.0f);
    glPopMatrix();

    // Braço direito
    glColor3f(1.0f, 0.0f, 0.0f);
    glPushMatrix();
    glTranslatef(0.3f, 0.3f, 0.0f);
    glRotatef(ombro, 0.0f, 0.0f, 1.0f);
    glTranslatef(0.2f, 0.0f, 0.0f);
    glPushMatrix();
    glScalef(0.4f, 0.15f, 0.15f);
    glutWireCube(1.0f);
    glPopMatrix();

    // Antebraço direito
    glColor3f(0.0f, 1.0f, 0.0f);
    glTranslatef(0.3f, 0.0f, 0.0f);
    glRotatef(cotovelo, 0.0f, 0.0f, 1.0f);
    glTranslatef(0.2f, 0.0f, 0.0f);
    glPushMatrix();
    glScalef(0.4f, 0.15f, 0.15f);
    glutWireCube(1.0f);
    glPopMatrix();

    glPopMatrix();

    // Braço esquerdo
    glColor3f(1.0f, 0.0f, 0.0f);
    glPushMatrix();
    glTranslatef(-0.3f, 0.3f, 0.0f);
    glRotatef(-ombro, 0.0f, 0.0f, 1.0f);
    glTranslatef(-0.2f, 0.0f, 0.0f);
    glPushMatrix();
    glScalef(0.4f, 0.15f, 0.15f);
    glutWireCube(1.0f);
    glPopMatrix();

    // Antebraço esquerdo
    glColor3f(0.0f, 1.0f, 0.0f);
    glTranslatef(-0.3f, 0.0f, 0.0f);
    glRotatef(-cotovelo, 0.0f, 0.0f, 1.0f);
    glTranslatef(-0.2f, 0.0f, 0.0f);
    glPushMatrix();
    glScalef(0.4f, 0.15f, 0.15f);
    glutWireCube(1.0f);
    glPopMatrix();

    glPopMatrix();

    // Base da perna (Cone)
    glColor3f(0.0f, 0.0f, 1.0f);
    glPushMatrix();
    glTranslatef(0.0f, -1.2f, 0.0f); 
    glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
    glScalef(0.4f, 0.4f, 1.5f);
    glutWireCone(0.3f, 0.6f, 20, 20);
    glPopMatrix();
}

void desenhaCena()
{
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();

    gluLookAt(0.0f, 0.0f, 5.0f,  // posição da câmera
              0.0f, 0.0f, 0.0f,  // ponto de interesse (olhando para a origem)
              0.0f, 1.0f, 0.0f); // vetor de "up"

    desenhaBoneco();

    glutSwapBuffers();
}

void redimensiona(int largura, int altura)
{
    if (altura == 0)
        altura = 1;

    glViewport(0, 0, largura, altura);

    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluPerspective(45.0f, (GLfloat)largura / (GLfloat)altura, 1.0f, 10.0f);
}

void teclado(unsigned char key, int x, int y)
{
    switch (key)
    {
    	case 'o':
		case 'O':
    		 ombro = ((int)ombro + 5) % 360;
    		glutPostRedisplay();
    		break;

		case 'c':
		case 'C':
    		cotovelo = ((int)cotovelo + 5) % 360;
    		glutPostRedisplay();
    		break;
    default:
        break;
    }
}

int main(int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
    glutInitWindowSize(800, 600);
    glutCreateWindow("Boneco 3D");
    glEnable(GL_DEPTH_TEST);

    glutDisplayFunc(desenhaCena);
    glutReshapeFunc(redimensiona);
    glutKeyboardFunc(teclado);

    glutMainLoop();

    return 0;
}
