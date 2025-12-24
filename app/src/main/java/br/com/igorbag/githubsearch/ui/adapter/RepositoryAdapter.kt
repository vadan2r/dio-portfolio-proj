package br.com.igorbag.githubsearch.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.igorbag.githubsearch.R
import br.com.igorbag.githubsearch.domain.Repository

class RepositoryAdapter(private val repositories: List<Repository>) :
    RecyclerView.Adapter<RepositoryAdapter.ViewHolder>() {

    var carItemLister: (Repository) -> Unit = {}
    var btnShareLister: (Repository) -> Unit = {}
    }

    // Cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.repository_item, parent, false)
        return ViewHolder(view)
    }

    // Pega o conteudo da view e troca pela informacao de item de uma lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //@TODO 8 -  Realizar o bind do viewHolder
        
        val repo = repositories[position]
        holder.repoName.text = repo.name

        // 👉 TODO 12: Clique no item abre navegador
        holder.itemView.setOnClickListener {
            carItemLister(repo)
        }

        // 👉 TODO 11: Clique no botão share
        holder.btnShare.setOnClickListener {
            btnShareLister(repo)
        }
    }

    // Pega a quantidade de repositorios da lista
    //@TODO 9 - realizar a contagem da lista
    override fun getItemCount(): Int = repositories.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //@TODO 10 - Implementar o ViewHolder para os repositorios
        
        val repoName = view.findViewById<TextView>(R.id.repoName) 
        val btnShare = view.findViewById<ImageButton>(R.id.btnShare)

        //init {
        //    view.apply {
        //        atributo = findViewById(R.id.item_view)
        //    }

    }
}


