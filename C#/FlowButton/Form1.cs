using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FlowButton
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void pictureBox1_Click(object sender, EventArgs e)
        {
            panel1.Visible = true;
            //Form2 form2 = new Form2();
            //form2.ShowDialog();
            //MessageBox.Show("Me Too٩(๑❛ᴗ❛๑)۶", "Love Message");
        }
        private void pictureBox2_MouseEnter(object sender, EventArgs e)
        {
            while (true)
            {
                Random ran = new Random();
                int x = ran.Next(1, 700);
                int y = ran.Next(1, 400);
                if (((x > 140 && x < 550) && (y > 80 && y < 180)) || ((x > 180 && x < 340) && (y > 180 && y < 340)))
                {
                    //break;
                }
                else
                {
                    this.pictureBox2.SetBounds(x, y, pictureBox2.Width, pictureBox2.Height);
                    break;
                }
            }
        }
        private void panel1_Click(object sender, EventArgs e)
        {
            panel1.Visible = false;
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            panel1.Visible = false;
        }

        private void label2_Click(object sender, EventArgs e)
        {
            panel1.Visible = false;
        }
    }
}
