#include <GL/glut.h>

int tipofigura;
GLfloat angle, fAspect;
GLint slices = 20, stacks = 10;
GLdouble size = 50.0f, radius = 25.0f, height = 50.0f, innerRadius = 25.0f, outerRadius = 25.0f;
GLdouble eyex = 0, eyey = 0, eyez = -200;
GLint nsides = 20, rings = 20;
GLfloat cor[3] = {0.5f, 0.5f, 0.5f};

void PosicionaObservador()
{
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
    gluLookAt(eyex, eyey, eyez, 0, 0, 0, 0, 1, 0);
}

void AlteraTamanhoJanela(GLsizei w, GLsizei h)
{
    if (h == 0)
        h = 1;
    glViewport(0, 0, w, h);
    fAspect = (GLfloat)w / (GLfloat)h;
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluPerspective(angle, fAspect, 0.1, 500);
    PosicionaObservador();
}

void EspecificaParametrosVisualizacao()
{
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluPerspective(angle, fAspect, 0.1, 500);
    PosicionaObservador();
    glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
}

void DesenhaBule()
{
    glColor3fv(cor);
    glutWireTeapot(size);
}

void DesenhaCubo()
{
    glColor3fv(cor);
    glutWireCube(size);
}

void DesenhaEsfera()
{
    glColor3fv(cor);
    glutWireSphere(radius, slices, stacks);
}

void DesenhaCone()
{
    glColor3fv(cor);
    glutWireCone(radius, height, slices, stacks);
}

void DesenhaTorus()
{
    glColor3fv(cor);
    glutWireTorus(innerRadius, outerRadius, slices, stacks);
}

void Desenha()
{
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

    switch (tipofigura)
    {
    case 1:
        DesenhaBule();
        break;
    case 2:
        DesenhaCubo();
        break;
    case 3:
        DesenhaEsfera();
        break;
    case 4:
        DesenhaCone();
        break;
    case 5:
        DesenhaTorus();
        break;
    }

    glutSwapBuffers();
}

void Teclado(unsigned char tecla, int x, int y)
{
    switch (tecla)
    {
    case '1':
        tipofigura = 1;
        break;
    case '2':
        tipofigura = 2;
        break;
    case '3':
        tipofigura = 3;
        break;
    case '4':
        tipofigura = 4;
        break;
    case '5':
        tipofigura = 5;
        break;
    case 'F':
    case 'f':
        eyez += 10;
        break;
    case 'T':
    case 't':
        eyez -= 10;
        break;
    case 'D':
    case 'd':
        eyex += 10;
        break;
    case 'E':
    case 'e':
        eyex -= 10;
        break;
    case 'C':
    case 'c':
        eyey += 10;
        break;
    case 'B':
    case 'b':
        eyey -= 10;
        break;
    case 'U':
    case 'u':
        slices++;
        break;
    case 'I':
    case 'i':
        if (slices > 3)
            slices--;
        break;
    case 'O':
    case 'o':
        stacks++;
        break;
    case 'P':
    case 'p':
        if (stacks > 3)
            stacks--;
        break;
    case 'N':
    case 'n':
        nsides++;
        break;
    case 'M':
    case 'm':
        if (nsides > 3)
            nsides--;
        break;
    case 'R':
    case 'r':
        rings++;
        break;
    case 'Y':
    case 'y':
        if (rings > 3)
            rings--;
        break;
    case '6':
        cor[0] = 1.0f; // Define a cor vermelha
		cor[1] = 0.0f;
		cor[2] = 0.0f;
        break;
    case '7':
        cor[0] = 0.0f; // Define a cor verde
		cor[1] = 1.0f;
		cor[2] = 0.0f;
        break;
    case '8':
        cor[0] = 0.0f; // Define a cor azul
		cor[1] = 0.0f;
		cor[2] = 1.0f;
        break;
    case '9':
        size += 10;
        break;
    case '0':
        if (size > 10)
            size -= 10;
        break;
    case 'G':
    case 'g':
        angle += 0.1f;
        break;
    }

    PosicionaObservador();
    glutPostRedisplay();
}

int main(int argc, char **argv)
{
    tipofigura = 1;
    angle = 45;
    fAspect = 1.0;

    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
    glutInitWindowSize(500, 500);
    glutCreateWindow("Imagens 3D");
    glutDisplayFunc(Desenha);
    glutReshapeFunc(AlteraTamanhoJanela);
    glutKeyboardFunc(Teclado);
    EspecificaParametrosVisualizacao();
    glutMainLoop();

    return 0;
}
