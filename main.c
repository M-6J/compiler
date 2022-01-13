#define _CRT_SECURE_NO_WARNINGS
#define M 30000
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <stdlib.h>
#include <unistd.h>

#ifndef O_BINARY
#define O_BINARY 0
#endif

char str[M];
char* result[M];
int i, j, n, k;
char c;

int main(int argc, char *argv[])
{
	int fd;
	int nReadSize, size = 0, off = 0;
	if ((fd = open(argv[1], O_RDONLY | O_BINARY)) == -1)
	{
		return 0;	
	}
	while (nReadSize = read(fd, str, M) > 0)
	{
		;	
	}    
	
	close(fd);

	for (int i = 0; i < strlen(str) + k; i++)
	{
		if (str[i] == '\n' || str[i] == '\t' || str[i] == '\r')
		{
			str[i] = ' ';
			++i;
		}
                else if (str[i] == ';')
                {
                        str[i] = ' ';
                        for (int j = strlen(str) + k; j > i; j--)
                        {
                                str[j + 1] = str[j];
                        }
                        for (int j = strlen(str) + k; j > i; j--)
                        {
                                str[j + 1] = str[j];
                        }
                        str[i + 1] = ';';
                        str[i + 2] = ' ';
                        ++i;
                        ++i;
                        ++i;
                        ++k;
                        ++k;
                }

		else if (str[i] == '(')
		{
			str[i] = ' ';
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			str[i + 1] = '(';
			str[i + 2] = ' ';
			++i;
			++i;
			++i;
			++k;
			++k;
		}
		else if (str[i] == ')')
		{
			str[i] = ' ';
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			str[i + 1] = ')';
			str[i + 2] = ' ';
			++i;
			++i;
			++i;
			++k;
			++k;
		}
		else if (str[i] == '{')
		{
			str[i] = ' ';
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			str[i + 1] = '{';
			str[i + 2] = ' ';
			++i;
			++i;
			++i;
			++k;
			++k;
		}
		else if (str[i] == '}')
		{
			str[i] = ' ';
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			str[i + 1] = '}';
			str[i + 2] = ' ';
			++i;
			++i;
			++i;
			++k;
			++k;
		}
		else if (str[i] == '<')
		{
			str[i] = ' ';
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			str[i + 1] = '<';
			str[i + 2] = ' ';
			++i;
			++i;
			++i;
			++k;
			++k;
		}
		else if (str[i] == '>')
		{
			str[i] = ' ';
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			for (int j = strlen(str) + k; j > i; j--)
			{
				str[j + 1] = str[j];
			}
			str[i + 1] = '>';
			str[i + 2] = ' ';
			++i;
			++i;
			++i;
			++k;
			++k;
		}
                else if (str[i] == '+')
                {
                        str[i] = ' ';
                        for (int j = strlen(str) + k; j > i; j--)
                        {
                                str[j + 1] = str[j];
                        }
                        for (int j = strlen(str) + k; j > i; j--)
                        {
                                str[j + 1] = str[j];
                        }
                        str[i + 1] = '+';
                        str[i + 2] = ' ';
                        ++i;
                        ++i;
                        ++i;
                        ++k;
                        ++k;
                }
		else if (str[i] == '=' && isalpha(str[i - 1]) != 0)
                {
                        for (int j = strlen(str) + k; j >= i; j--)
                        {
                                str[j + 1] = str[j];
                        }
                        str[i] = ' ';
                        ++i;
                        ++k;
                }
                else if (str[i] == '=' && isdigit(str[i - 1]) != 0)
                {
                        for (int j = strlen(str) + k; j >= i; j--)
                        {
                                str[j + 1] = str[j];
                        }
                        str[i] = ' ';
                        ++i;
                        ++k;
                }
                else if (isdigit(str[i]) != 0)
                {
                        char c = str[i];
                        if (str[i - 1] == '=')
                        {
                                str[i] = ' ';
                                for (int j = strlen(str) + k; j > i; j--)
                                {
                                        str[j + 1] = str[j];
                                }
                                str[i + 1] = c;
                                ++i;
                                ++i;
                                ++k;
                        }
                }
        }
        for (int i = 0; i < strlen(str); i++)
        {
                if ((str[i] == ' ' || str[i] == '\t' || str[i] == '\n') && str[i] != '_')
                {
                        if (isdigit(str[i + 1]) != 0)
                        {
                                for (int j = i + 1; j < strlen(str); j++)
                                {
					if (str[j] == ' ')
						break;
                                        if (isdigit(str[j]) != 0)
                                        {
                                                if (isalpha(str[j + 1]) != 0)
                                                {
                                                        for (int k = strlen(str); k > j; k--)
                                                        {
                                                                str[k + 1] = str[k];
                                                        }
                                                        str[j + 1] = ' ';
                                                        j++;
                                                        i++;
							break;
                                                }
                                        }
                                }
                        }
                }
        }
	for(int i = 0; i < strlen(str); i++)
        {
                if(str[i] == '{')
                {
                        if(isalpha(str[i + 1]) != 0 || isdigit(str[i + 1]) != 0)
                        {
                                char t = str[i + 1];
                                str[i + 1] = ' ';
                                for (int j = strlen(str); j > i; j--)
                                {
                                        str[j + 1] = str[j];
                                }
                                str[i + 2] = t;
                                ++i;
                                ++i;
                        }
                }
        }
        for(int i = 0; i < strlen(str); i++)
        {
                if(str[i] == ';')
                {
                        if(isalpha(str[i + 1]) != 0 || isdigit(str[i + 1]) != 0)
                        {
                                char t = str[i + 1];
                                str[i + 1] = ' ';
                                for (int j = strlen(str); j > i; j--)
                                {
                                        str[j + 1] = str[j];
                                }
                                str[i + 2] = t;
                                ++i;
                                ++i;
                        }
                }
        }
	for(int i = 0; i < strlen(str); i++)
	{
		if(str[i] == '\t')
			str[i] = ' ';
	}


	char* ptr = strtok(str, " \n");
	while (ptr != NULL)
	{
		result[j] = ptr;
		j++;
		ptr = strtok(NULL, " \n");
	}

	while(result[n] != NULL)
	{
		if (strcmp(result[n], "if") == 0)
		{
			printf("If\n");
			n++;
		}
		else if (strcmp(result[n], "else") == 0)
		{
			printf("Else\n");
			n++;
		}
		else if (strcmp(result[n], "while") == 0)
		{
			printf("While\n");
			n++;
		}
		else if (strcmp(result[n], "break") == 0)
		{
			printf("Break\n");
			n++;
		}
		else if (strcmp(result[n], "continue") == 0)
		{
			printf("Continue\n");
			n++;
		}
		else if (strcmp(result[n], "return") == 0)
		{
			printf("Return\n");
			n++;
		}
                else if (strcmp(result[n], "====") == 0)
                {
                        printf("Eq\nEq\n");
                        n++;
                }

		else if (strcmp(result[n], "===") == 0)
		{
			printf("Eq\nAssign\n");
			n++;
		}
		else if (strcmp(result[n], "==") == 0)
		{
			printf("Eq\n");
			n++;
		}
		else if (strcmp(result[n], "=") == 0)
		{
			printf("Assign\n");
			n++;
		}
		else if (strcmp(result[n], ";") == 0)
		{
			printf("Semicolon\n");
			n++;
		}
		else if (strcmp(result[n], "(") == 0)
		{
			printf("LPar\n");
			n++;
		}
		else if (strcmp(result[n], ")") == 0)
		{
			printf("RPar\n");
			n++;
		}
		else if (strcmp(result[n], "{") == 0)
		{
			printf("LBrace\n");
			n++;
		}
		else if (strcmp(result[n], "}") == 0)
		{
			printf("RBrace\n");
			n++;
		}
		else if (strcmp(result[n], "+") == 0)
		{
			printf("Plus\n");
			n++;
		}
		else if (strcmp(result[n], "*") == 0)
		{
			printf("Mult\n");
			n++;
		}
		else if (strcmp(result[n], "/") == 0)
		{
			printf("Div\n");
			n++;
		}
		else if (strcmp(result[n], "<") == 0)
		{
			printf("Lt\n");
			n++;
		}
		else if (strcmp(result[n], ">") == 0)
		{
			printf("Gt\n");
			n++;
		}
		else if (isalpha(*result[n]) != 0 || *result[n] == '_')
		{
			printf("Ident(%s)\n", result[n]);
			n++;
		}
		else if (isdigit(*result[n]) != 0)
		{
			printf("Number(%s)\n", result[n]);
			n++;
		}
		else
		{
			printf("Err\n");
			break;
		}
	}
	return 0;
} 
